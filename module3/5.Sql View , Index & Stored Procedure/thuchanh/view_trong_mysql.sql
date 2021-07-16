create view customer_views as 
select customerNumber , customerName , phone from customers;

select * from customer_views;

/*Cập nhật view có thể dùng create hoặc replace*/
CREATE OR REPLACE VIEW customer_views AS
SELECT customerNumber, customerName, contactFirstName, contactLastName, phone
FROM customers
WHERE city = 'Nantes';

select * from customer_views;

drop view customer_view, customer_views;

