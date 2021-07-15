use services;
/*Tham số loại IN*/

DELIMITER $$
create procedure getCusbyID(IN cusNum int(11))
begin 
	select * from customers where customerNumber = cusNum;
end $$

call getCusbyID(175); /*Gọi stored procedure */

/*Tham số loại OUT
Khi truyền tham số vào dạng OUT phải có chữ @ đằng trước biến*/ 
DELIMITER $$
create procedure getCustomerCountryByCity(in in_city varchar(50), out total int)
begin 
	select count(customerNumber) INTO total from customers where city = in_city;
end $$

call getCustomerCountryByCity('Lyon',@total);
select @total;

/*Tham số loại INOUT là sự kết hợp giữa IN và OUT*/
DELIMITER $$
create procedure setCounter(inout counter int , in inc int)
begin 
	set counter = counter + inc ;
end $$	

set @counter = 1;
call setCounter(@counter,1);
call setCounter(@counter,1);
call setCounter(@counter,5);
select @counter;
