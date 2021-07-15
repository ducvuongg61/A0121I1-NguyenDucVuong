SELECT * FROM services.customers;

DELIMITER $$ 
create procedure findAllCustomers() 
begin 
	select * from customers;
end $$ 
DELIMITER ; 

call findAllCustomers(); /*Gọi procedure */

/*Câu lệnh để xóa procedure */
DELIMITER $$
DROP procedure if exists `findAllCustomers`; $$

/* Trong MySql không có sửa mà chỉ tạo mới lại một procedure
Lệnh Drop để xóa đi Procedure đó và tạo lại*/

DELIMITER $$
DROP procedure if exists `findAllCustomers`$$
CREATE procedure findAllCustomers()
begin 
	select * from customers where customerNumber = 175;
end; $$

call findAllCustomers();
