create database demo;
use demo;
create table contacts(
	contact_id int(11) not null unique auto_increment,
    last_name varchar(30) not null,
    first_name varchar(30) not null,
    birthday date,
    constraint contacts_pk primary key (contact_id) /*khoa chinh ten : contacts_pk va duoc gan cho cot contact_id*/
);

create table supplies(
	supplies_id int(11) not null unique auto_increment,
    supplies_name varchar(50) not null,
    account_rep varchar(30) not null default 'TBD',
    constraint supplies_pk primary key(supplies_id)
);

/*Xoa bang supplies*/
drop table supplies;

/*them 1 cot vao sau 1 cot nao do*/
alter table contacts
add address varchar(30) not null 
after first_name;

/*Mac dinh them vao cuoi table*/
alter table contacts
add type_contact varchar(30);

/*Them nhieu cot*/
alter table contacts
add phoneNumber varchar(11) not null
after address,
add gender varchar(5) not null
after phoneNumber;

/*Thay doi mo ta cua 1 cot*/
alter table contacts
modify last_name varchar(50) null;

/*Xoa 1 cot trong bang*/
alter table contacts
drop column type_contact;

/*Thay doi ten cot*/
alter table contacts
change column type_contact ctype varchar(50) not null;
/*               ten cu   ten moi*/

/*Doi ten table*/
alter table contacts
rename to people;









