/*Tra ve ngay sinh nho nhat*/
select * from database_mysql.customers 
order by customer_birthday
limit 1;

/*Truy van long nhau*/
select * from database_mysql.customers
where customer_birthday = (select min(customer_birthday) from database_mysql.customers);

select * from hoc_vien 
where not exists (select * from lop where hoc_vien.ma_lop = lop.ma_lop); 

select ma_hv, ten_hv, ngay_sinh, dia_chi, concat('CGDN-',ma_lop) as ma_lop from hoc_vien; 

select * , (year(now()) - year(customer_birthday)) as tuoi from database_mysql.customers;

select * , timestampdiff(year,customer_birthday,curdate()) as tuoi from database_mysql.customers;

SELECT customerNumber,customerName,phone,addressLine1,city, if(country = 'USA', 'Yes', 'No') as inUSA
FROM customers;

Select customerNumber, customerName, phone, addressLine1, city, case when country = 'USA' then 'Yes' else 'No' End as inUSA from services.customers;