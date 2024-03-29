create table customers(
	id int auto_increment primary key,
    c_name varchar(40),
    address varchar(255),
    email varchar(255)
);

create table orders(
	id int auto_increment,
    staff varchar(50),
    primary key(id),
    customer_id int,
    foreign key (customer_id) references customers(id)
);