/*Tao khoa chinh theo 2 cach*/
create table users(
	user_id int auto_increment primary key,
    user_name varchar(40),
    password varchar(255),
    email varchar(255)
);

create table roles(
	role_id int auto_increment,
    role_name varchar(50),
    primary key(role_id)
);


create table userrole(
	user_id int not null,
    role_id int not null,
    primary key(user_id, role_id),
    foreign key(user_id) references users(user_id),
    foreign key(role_id) references roles(role_id)
    /*          column              toTable(toColumn)*/
);

/*Tao khoa chinh khi thay doi bang*/
/*alter table table_name
	add primary key(primary_key_column)*/



