SELECT * FROM services.customers;

explain select * from services.customers
where customerNumber = 175;

use services;

alter table customers add index idx_customerNumber(customerNumber);
explain select * from customers where customerNumber = 175;

alter table customers drop index idx_customerNumber;

alter table customers add index idx_full_name(contactFirstName , contactLastName);
explain select * from customers where contactFirstName = 'Jean' or contactFirstName = 'King';

alter table customers drop index idx_full_name;