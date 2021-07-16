create database database_mysql;
use database_mysql;

create table rent_type(
	rent_type_id int primary key,
    rent_type_name varchar(50),
    rent_type_price double
);

create table service_type(
	service_type_id int primary key,
    service_type_name varchar(50)
);

create table services(
	service_id int primary key,
    service_name varchar(50) not null,
    service_area double not null,
    service_number_floors int not null,
    service_max_people int,
    service_cost double,
    rent_type_id int,
    foreign key(rent_type_id) references rent_type(rent_type_id),
    service_type_id int,
    foreign key(service_type_id) references service_type(service_type_id),
    service_status varchar(50)
);

create table customer_type(
	customer_type_id int primary key,
    customer_type_name varchar(50)
);

create table customers(
	customer_id int primary key,
    customer_type_id int,
    foreign key(customer_type_id) references customer_type(customer_type_id),
    customer_name varchar(50) not null,
    customer_birthday date,
    customer_id_card varchar(15),
    customer_phone varchar(50),
    customer_mail varchar(50),
    customer_address varchar(50)
);

create table `position`(
	position_id int primary key,
    position_name varchar(50)
);

create table education(
	education_id int primary key,
    education_name varchar(50)
);

create table division(
	division_id int primary key,
    division_name varchar(50)
);

create table employees(
	employee_id int primary key,
    employee_name varchar(50) not null,
    position_id int,
    foreign key(position_id) references `position`(position_id),
    education_id int,
    foreign key(education_id) references education(education_id),
    division_id int,
    foreign key(division_id) references division(division_id),
    employee_birthday date,
    employee_id_card varchar(15),
    employee_salary double,
    employee_phone varchar(50),
    employee_email varchar(50),
    employee_address varchar(50)
);

create table attach_service(
	attach_service_id int primary key,
    attach_service_name varchar(50),
    attach_service_cost double,
    attach_service_unit varchar(50),
    attach_service_status varchar(50)
);

create table contact(
	contact_id int primary key,
    service_id int,
    foreign key(service_id) references services(service_id),
    customer_id int,
    foreign key(customer_id) references customers(customer_id),
    employee_id int,
    foreign key(employee_id) references employees(employee_id),
    contact_start_date date,
    contact_end_date date,
    contact_deposit double,
    contact_total_money double
);

create table contact_detail(
	contact_detail_id int primary key,
    contact_id int,
    foreign key(contact_id) references contact(contact_id),
    attach_service_id int,
    foreign key(attach_service_id) references attach_service(attach_service_id),
    amount int
);

insert into rent_type
values 
(1,'day',1000),
(2,'month',2000),
(3,'year',2500);

insert into service_type
values
(1,'Single'),
(2,'Company'),
(3,'Family');

insert into services
values
(1,'Villa',80.3,4,5,1000,1,1,'empty'),
(2,'House',100.6,2,10,2500,2,2,'empty'),
(3,'Room',95.6,3,5,3000,3,3,'empty'),
(4,'House',65,2,10,1560,2,3,'empty'),
(5,'Room',50.9,2,2,9664,3,2,'full'),
(6,'Villa',99.6,2,2,17951,3,1,'full'),
(7,'Villa',50, 3,9,11000000,1,2,'empty'),
(8,'Room',15,1,9,6000000,2,2,'full'),
(9,'House',25,2,9,8000000, 2,3, 'empty'),
(10,'Villa',38,4,9,15000000, 3,3,'full'),
(11,'Room',21,1,9,6300000, 1, 3,'empty'),
(12,'Room',18,2,9,3000000, 3, 1, 'empty');

insert into customer_type
values
(1,'Diamond'),
(2,'Platium'),
(3,'Gold'),
(4,'Member');

insert into customers
values
(1,1,'Dat','1996-02-11','19994403','0944334334','dat@gmail.com','Da Nang'),
(2,3,'Nam','1994-01-14','19991203','0943234567','nam@gmail.com','Quang Ngai'),
(3,4,'Quang','2003-02-11','11394403','0944334543','quang@gmail.com','Quang Tri'),
(4,2,'Viet','1950-02-11','11394403','0944334543','viet@gmail.com','Quang Tri'),
(5,3,'Quang','1950-02-11','11391233','0944334543','quang@gmail.com','Quang Nam'),
(6,1,'Binh','1951-03-12','11391433','094432355','binh@gmail.com','Vinh'),
(7,3,'Vu','1992-02-16','19966442','0944334334','quang@gmail.com','Da Nang'),
(8, 1, 'An', '1989-5-28', 201132326, 0365978525, 'an@gmail.com', 'Vinh'),
(9, 4, 'Kieu', '1865-7-21', 123456789, 0365798451, 'kieu123@gmail.com', 'Da Nang'),
(10, 3, 'Hai', '2001-12-5', 234567891, 0657984123, 'haiqd@gmail.com', 'Da Nang'),
(11, 3, 'Viet', '2015-10-10', 345678912, 0936421587, 'viet@gmail.com', 'Da Nang'),
(12, 2, 'Huong', '1950-1-18', 912345678, 0978432155, 'huong@gmail.com', 'Quang Tri'),
(13, 1, 'Toan', '1997-4-12', 865412397, 0365125487, 'taon@gmail.com', 'Quãng Ngãi'),
(14, 2, 'Nha', '1993-7-30', 886649777, 0644458412, 'nha@gmail.com', 'Quang Tri'),
(15, 1, 'Anh', '1993-7-30', 881554577, 0155548545, 'anh@gmail.com', 'Vinh'),
(16, 3, 'Thuan', '1993-7-30', 699494977, 0154477845, 'thuan@gmail.com', 'Quang Tri');

insert into `position`
values
(1,'Receptionist'),
(2,'Server'),
(3,'Expert'),
(4,'Monitoring'),
(5,'Manage'),
(6,'Director');

insert into education
values 
(1,'Intermediate'),
(2,'College'),
(3,'University'),
(4,'After university');

insert into division
values
(1,'Sales - Marketing'),
(2,'Administration'),
(3,'Server'),
(4,'Manage');

insert into employees
values
(1,'Dat',1,1,3,'1996-02-28','18549545','1000','0985947544','dat@gmail.com','Quang Binh'),
(2,'Tien',2,2,4,'1999-02-20','18565545','800','0985947111','tien@gmail.com','Quang Tri'),
(3,'Khoa',3,3,2,'1993-10-04','18565545','500','0984945612','khoa@gmail.com','Quang Tri'),
(4,'Hoa',4,4,1,'1983-11-09','18587655','2000','0984777716','hoa@gmail.com','Da Nang'),
(5,'Quyet',5,3,3,'1997-03-10','18589995','3000','0989997145','quyet@gmail.com','Vung Tau'),
(6,'Vuong',6,3,2,'2000-01-06','19664588','2650','0974405695','vuong@gmail.com','Quang Tri'),
(7, 'Cuong', 4, 4, 4, '1999-10-17', 201783537, 13000000, 0365797022, 'ngoccuong@gmail.com', 'Da Nang'),
(8, 'Danh', 6, 2, 1, '1999-12-24', 20171234, 7000000, 0963578925, 'congdanh123@gmail.com', 'Ha Noi'),
(9, 'Huy', 5, 4, 2, '2000-6-20', 201815975, 4000000, 0365794267, 'huynguyen2k@gmail.com', 'Ho Chi Minh'),
(10, 'Huynh', 2, 1, 3, '2001-2-28', 301789653, 7500000, 0691354781, 'tam123123123@gmail.com', 'Quang Tri'),
(11, 'Thanh', 3, 3, 1, '1999-9-26', 201713987, 30000000, 0698342111, 'thanhthao99@gmail.com', 'Da Nang'),
(12, 'Khang', 1, 2, 2, '2000-10-25', 301632156, 8000000, 0321654988, 'anzxc123@gmail.com', 'Huế'),
(13, 'Tam', 3, 3, 4, '2001-3-29', 301789653, 7500000, 0691354781, 'tam123123123@gmail.com', 'Quang Tri'),
(14, 'Tien', 1, 3, 4, '2001-3-29', 301789653, 7500000, 0691354781, 'le123123123@gmail.com', 'Quang Tri');

insert into attach_service
values
(1,'Massage',1000,1,'Open'),
(2,'Karaoke',2000,3,'Close'),
(3,'Drink',3000,2,'Open'),
(4,'Food',4000,4,'Close'),
(5,'Rent car',5000,5,'Open');

insert into contact
values
(1,2,4,1,'2018-01-20','2019-02-21',1000,10000),
(2,5,2,4,'2019-09-22','2019-01-23',2000,20000),
(3,1,3,6,'2018-03-24','2019-03-25',3000,30000),
(4,4,6,3,'2018-05-30','2018-05-31',3000,70000),
(5,5,5,2,'2019-05-17','2019-06-18',4000,60000),
(6,2,7,5,'2019-03-12','2019-03-13',5000,50000),
(7,3,3,5,'2019-12-12','2019-12-13',6000,40000),
(8,1,7,3,'2019-04-12','2019-12-13',7000,20000),
(9,3,5,4,'2019-01-12','2019-01-13',6111,85544),
(10,6,16, 14, '2018-1-28', '2030-7-28', 4000, 13000),
(11,7,15, 7, '2019-3-12', '2035-5-21', 6000, 20000),
(12,7,11, 8, '2019-2-20', '2040-6-12', 4500, 16000),
(13,9,10, 10, '2018-1-20', '2040-6-12', 4500, 14000),
(14,12,12, 9, '2019-10-20', '2040-6-12', 4500, 20000),
(15,10,9, 11, '2019-2-20', '2040-6-12', 4500, 22000),
(16,11,7, 10, '2019-10-20', '2040-6-12', 4500, 31000),
(17,11,8, 12, '2018-4-28', '2030-7-28', 4000, 13000),
(18,12,6, 13, '2019-10-28', '2030-7-28', 4000, 13000),
(19,8,14, 9, '2019-4-28', '2030-7-28', 4000, 20000),
(20,8,13, 8, '2014-4-28', '2030-7-28', 4000, 20000),
(21,1,1,1,'2019-12-12','2019-12-15',300,15000);


insert into contact_detail
values
(1,1,1,10),
(2,2,2,20),
(3,3,3,30),
(4,4,2,40),
(5,5,4,80),
(6,6,4,110),
(7,7,3,50),
(8,8, 5, 100),
(9,9, 5, 50),
(10,10, 2, 40),
(11,11, 3, 19),
(12,12, 2, 5),
(13,13, 4, 10),
(14,14, 1, 30),
(15,15, 5, 6),
(16,16, 1, 6),
(17,17, 5, 6),
(18,18, 2, 6),
(19,19, 4, 6),
(20,20, 3, 6),
(21,21,3,9);


/*Cau2*/
select * from employees 
where (employee_name like 'H%' or employee_name like 'T%' or employee_name like 'K%') and length(employee_name) <= 15;

/*Cau3*/
select * from customers
where (timestampdiff(year , customer_birthday , curdate()) >= 18 and timestampdiff(year , customer_birthday , curdate()) < 50) 
and (customer_address like 'Da Nang' or customer_address like 'Quang Tri');

/*Cau4*/
select customers.customer_name , count(contact_id) as times from customers 
inner join contact on customers.customer_id = contact.customer_id
inner join customer_type on customers.customer_type_id = customer_type.customer_type_id
where customer_type_name like 'Diamond'
group by customers.customer_id
order by count(contact.customer_id) asc;

/*Cau5*/
select customers.customer_id , customers.customer_name , customer_type.customer_type_name , contact.contact_id , services.service_name , 
contact.contact_start_date , contact.contact_end_date , sum(services.service_cost + (contact_detail.quanlity * attach_service.attach_service_cost)) as total_money
from customers
left join customer_type on customers.customer_type_id = customer_type.customer_type_id
left join contact on customers.customer_id = contact.customer_id
left join services on services.service_id = contact.service_id
left join contact_detail on contact_detail.contact_id = contact.contact_id
left join attach_service on attach_service.attach_service_id = contact_detail.attach_service_id
group by customers.customer_id;


/*Cau6*/
select services.service_id , services.service_name , services.service_area ,  services.service_cost , service_type.service_type_name , contact.contact_start_date from services
inner join service_type on service_type.service_type_id = services.service_type_id
left join contact on contact.service_id = services.service_id 
where quarter(contact.contact_start_date) > 1 and contact.service_id = services.service_id and year(contact_start_date) = 2019;

/*Cau7*/
select services.service_id , services.service_name , services.service_area , services.service_area , services.service_max_people , services.service_cost , service_type.service_type_name , contact.contact_id from services
inner join service_type on service_type.service_type_id = services.service_type_id
left join contact on contact.service_id = services.service_id
where exists (select contact.contact_id from contact where (year(contact_start_date) = 2018 ) and contact.service_id = services.service_id)
and 
not exists (select contact.contact_id from contact where (year(contact_start_date) = 2019 ) and contact.service_id = services.service_id);

/*Cau8*/
/*c1*/
select distinct customer_name 
from customers;
/*c2*/
select customer_name
from customers
group by customer_name;
/*c3*/
select customer_name
from customers
left join customer_type on customers.customer_id = customer_type.customer_type_id
union
select customer_name
from customers
right join customer_type on customers.customer_id = customer_type.customer_type_id;

/*Cau9*/
select `month`.month , count(month(contact.contact_start_date)) as times_order , sum(contact.contact_total_money) as total_money from 
(select 1 as month
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as `month`
left join contact on month(contact.contact_start_date) = `month`.month
left join customers on customers.customer_id = contact.customer_id
where year(contact.contact_start_date) = 2019 or year(contact.contact_start_date) is null or month(contact.contact_start_date) is null
group by `month`.month
order by `month`.month;

/*Cau10*/
select contact.contact_id , contact.contact_start_date , contact.contact_end_date , contact.contact_deposit , count(contact_detail.attach_service_id) as amount from contact
inner join contact_detail on contact_detail.contact_id = contact.contact_id
group by contact.contact_id;


/*Cau11*/
select attach_service.attach_service_id , attach_service.attach_service_name , attach_service.attach_service_cost , attach_service.attach_service_unit, attach_service.attach_service_status , customers.customer_address
from attach_service
left join contact_detail on contact_detail.attach_service_id = attach_service.attach_service_id
inner join contact on contact.contact_id = contact_detail.contact_id
inner join customers on customers.customer_id = contact.customer_id
inner join customer_type on customer_type.customer_type_id = customers.customer_type_id
where customer_type.customer_type_name = 'Diamond' and customers.customer_address in ('Vinh','Quang Ngai');

/*Cau12*/
select contact.contact_id , employees.employee_name , customers.customer_name , customers.customer_phone , services.service_name , count(contact_detail.attach_service_id) as amount from contact
inner join contact_detail on contact_detail.contact_id = contact.contact_id
inner join attach_service on attach_service.attach_service_id = contact_detail.attach_service_id
inner join employees on employees.employee_id = contact.employee_id
inner join customers on customers.customer_id = contact.customer_id
inner join services on services.service_id = contact.service_id
where exists ( select contact2.contact_id from contact as contact2 
	where contact2.contact_id = contact.contact_id and contact.contact_start_date between '2019-10-01' and '2019-12-31')
and 
not exists ( select contact3.contact_id from contact as contact3
	where contact3.contact_id = contact.contact_id and contact.contact_start_date between '2019-01-01' and '2019-06-30');

/*Cau13*/





