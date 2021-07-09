create database data_1;
use data_1;

create table customers(
	customer_number int not null unique auto_increment primary key,
    fullname varchar(50),
    address varchar(255),
    email varchar(255),
    phone varchar(255)
);

create table accounts(
	account_number int not null auto_increment primary key,
    account_type varchar(255),
    account_date date,
    balance int,
    customer_number int,
    foreign key(customer_number) references customers(customer_number)
);

create table transactions(
	tran_number int not null auto_increment primary key,
    account_number_tran varchar(255),
    date_tran date,
    amount int,
    account_number int,
    foreign key(account_number) references accounts(account_number)
);