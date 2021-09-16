DELIMITER $$
create procedure select_all_user()
begin 
	select * from users;
end $$
DELIMITER ;

call select_all_user;

DELIMITER $$
create procedure edit_user(IN user_name varchar(120) ,IN user_email varchar(220) , IN user_country varchar(120) , IN user_id int)
begin 
	update users set name = user_name , email = user_email , country = user_country
    where id = user_id;
end $$
DELIMITER ;

call edit_user("BigBang" , "bigbang" , "Korean" , 1);

DELIMITER $$
create procedure delete_user(IN id_user int)
begin 
	delete from users where id = id_user;
end $$
DELIMITER ;

call delete_user(17);
