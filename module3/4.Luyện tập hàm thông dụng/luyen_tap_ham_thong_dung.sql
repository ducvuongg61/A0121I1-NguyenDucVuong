create database students;
use students;

create table table_students(
	id int,
    name_student varchar(50),
    age int,
    course varchar(50),
    money long
);

insert into table_students(id,name_student,age,course,money)
values 
(1 , 'Hoang' , 21 , 'CNTT' , 400000),
(2 , 'Viet' , 19 , 'DTVT' , 320000),
(3 , 'Thanh' , 18 , 'KTDN' , 400000),
(4 , 'Nhan' , 19 , 'CK' , 450000),
(5 , 'Huong' , 20 , 'CNTT' , 500000),
(5 , 'Huong' , 20 , 'CNTT' , 200000);

/* - Viết câu lệnh hiện thị tất cả các dòng có tên là Huong */
select * from table_students
where name_student = 'Huong';

/* - Viết câu lệnh lấy ra tổng số tiền của Huong */
select name_student , sum(money) as total_money 
from table_students
where name_student = 'Huong';

/* - Viết câu lệnh lấy ra tên danh sách của tất cả học viên, không trùng lặp */
select id,name_student,age,course , sum(money) as money 
from table_students
group by name_student;