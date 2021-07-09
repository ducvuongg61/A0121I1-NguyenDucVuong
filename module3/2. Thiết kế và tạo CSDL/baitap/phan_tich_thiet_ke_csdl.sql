use services;
DROP table groups_1, users;

create database oto;
use oto;

drop database oto;

create table offices(
	officeCode  varchar(100) not null primary key,
    city varchar(50) not null,
    phone varchar(50) not null,
    addressLine1 varchar(50) not null,
    addressLine2 varchar(50) not null,
    state varchar(50) not null,
    country varchar(50) not null,
    postalCode varchar(15) not null,
    territory varchar(10) not null
);

alter table offices
modify addressLine2 varchar(50);

alter table offices
modify state varchar(50);

create table productLines(
	productLine varchar(50) primary key not null,
    textDescription text,
    htmlDescription mediumtext,
    image  varchar(255)
);

create table products(
	productCode  varchar(15) not null primary key,
    productName  varchar(70) not null,
	productLine varchar(50),
    productScale  varchar(10) not null,
    productVendor  varchar(50) not null,
    productDescription  text not null,
    quantityInStock  int not null,
    buyPrice  float not null,
    MSRP float not null,
    foreign key(productLine) references productLines(productLine)
);

create table employees(
	employeeNumber  int primary key not null,
    lastName varchar(50) not null,
    firstName varchar(50) not null,
    extendtion varchar(10) not null,
    email varchar(100) not null,
    officeCode varchar(100),
    reportTo int,
    jobTitle varchar(50) NOT NULL,
    foreign key(reportTo) references employees(employeeNumber),
    foreign key(officeCode) references offices(officeCode)
);

alter table employees
rename column  extendtion to extension;

alter table employees
rename column reportTo to reportsTo;

create table customers(
	customerNumber  int not null auto_increment primary key,
    customerName  varchar(50) not null,
    contactLastName  varchar(50) not null,
    contactFirstName  varchar(50) not null ,
    phone  varchar(50) not null,
    addressLine1 varchar(50) not null,
    addressLine2 varchar(50) not null,
    city varchar(50) not null,
    state varchar(50) not null,
    postalCode varchar(15) not null,
    country varchar(50) not null,
    creditLimit float,
    saleRepEmployeeNumber int,
    foreign key(saleRepEmployeeNumber) references employees(employeeNumber)
);

select * from services.customers;

alter table customers 
DROP column creditLimit;

alter table customers
rename column saleRepEmployeeNumber to salesRepEmployeeNumber;

alter table customers
add column creditLimit float after saleRepEmployeeNumber;

alter table orders
modify shippedDate datetime;

create table orders(
	orderNumber  int not null primary key,
    orderDate datetime not null,
    requiredDate datetime not null,
    shippedDate datetime not null,
    status_order  varchar(15) not null,
    comments text,
    customerNumber int,
    foreign key(customerNumber) references customers(customerNumber)
);

select * from services.orders;

alter table orders
rename column status_order to `status`;

drop table payments;

create table payments(
	customerNumber int not null ,
    checkNumber varchar(50) not null,
    paymentDate datetime not null,
    amount float not null,
    primary key(customerNumber,checkNumber),
    foreign key(customerNumber) references customers(customerNumber)
);


select * from services.payments;

create table products_have_orders(
	order_number int,
    productCode varchar(15),
    quantityOrdered int not null,
    priceEach decimal(10,2) not null,
    orderLineNumber smallint not null,
    primary key(order_number , productCode),
    foreign key(order_number) references orders(orderNumber),
    foreign key(productCode) references products(productCode)
);


