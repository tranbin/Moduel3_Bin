create database FuramaManagerment ; 
use FuramaManagerment ; 

create table `position`(
position_id int primary key auto_increment, 
position_name varchar(45));

insert into `position` values (1,"123456");

create table education_degree(
education_degree_id int primary key auto_increment, 
education_degree_name varchar(45));

insert into education_degree values (1,"Bin");

create table division(
division_id int primary key auto_increment, 
division_name varchar(45));

insert into division values (1,"123456");

create table `role`(
role_id int primary key auto_increment, 
role_name varchar(255));

create table `user`(
username varchar(255) primary key, 
password varchar(255));	

insert into `user` values ("Bin","123456");

create table user_role(
role_id int, 
username varchar(255),
foreign key(role_id) references `role`(role_id),
foreign key(username) references `user`(username)
);

create table attach_service(
attach_service_id int primary key auto_increment, 
attach_service_name varchar(45),
attach_service_cost double, 
attach_service_unit int,
attach_service_status varchar(45)
);	

insert into attach_service values(1,"Bin",1,1,"Nope");



create table rent_type(
rent_type_id int primary key auto_increment, 
rent_type_name varchar(45),
rent_type_cost double);

insert into rent_type values (3,"ABC",20),
(4,"DEF",30);

create table service_type(
service_type_id int primary key auto_increment, 
service_type_name varchar(45));

insert into service_type values (3,"ABC"),
(4,"DEF");

create table service(
service_id int primary key auto_increment, 
service_name varchar(45),
service_area int,
service_cost double,
service_max_people int,
standard_room varchar(45),
description_other_convenience varchar(45),
pool_area double,
number_of_floors int,
rent_type_id int,
service_type_id int,
foreign key(rent_type_id) references rent_type(rent_type_id),
foreign key(service_type_id) references service_type(service_type_id)
);

insert into service values (5,"ABC",10,10,10,"vip","PRO",10,10,4,4),
(6,"DEF",10,10,10,"Normal","CHICKEN",10,10,3,3);

select * from service;

create table customer_type(
customer_type_id int primary key auto_increment, 
customer_type_name varchar(45));

insert into customer_type values (2,"Bin");

create table customer(
customer_id int primary key auto_increment, 
customer_name varchar(45),
customer_birthday date,
customer_gender bit(1),
customer_id_card varchar(45),
customer_phone varchar(45),
customer_email varchar(45),
customer_address varchar(45),
customer_type_id int,
foreign key(customer_type_id) references customer_type(customer_type_id)
);
select * from customer;

insert into customer(customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id) values
("Trần Khánh Bin","1997-07-12",1,"1207","0332136545","nevergiverup127@gmail.com","Thừa Thiên Huế",2);

create table employee(
employee_id int primary key auto_increment, 
employee_name varchar(45),
employee_birthday date,
employee_id_card varchar(45),
employee_salary double,
employee_phone varchar(45),
employee_email varchar(45),
employee_address varchar(45),
employee_type_id int,
position_id int,
education_degree_id int,
division_id int,
username varchar(255),
foreign key(position_id) references `position`(position_id),
foreign key(education_degree_id) references education_degree(education_degree_id),
foreign key(division_id) references division(division_id),
foreign key(username) references user(username)
);

insert into employee(employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,employee_type_id,position_id,
education_degree_id,division_id,username) values ("Bin","1997-12-07","1",400000,"0332136545","abc@gmail.com","hue",1,1,1,1,"Bin");

select * from employee;

create table contract(
contract_id int primary key auto_increment, 
contract_start_date datetime,
contract_end_date datetime,
contract_deposit double,
contract_total_money double,
employee_id int,
customer_id int,
service_id int,
foreign key(employee_id) references employee(employee_id),
foreign key(customer_id) references customer(customer_id),
foreign key(service_id) references service(service_id)
);
select * from contract ;

create table contract_detail(
contract_detail_id int primary key auto_increment,
quantity int ,
contract_id int ,
attach_service_id int,
foreign key(contract_id) references contract(contract_id),
foreign key(attach_service_id) references attach_service(attach_service_id)
);

