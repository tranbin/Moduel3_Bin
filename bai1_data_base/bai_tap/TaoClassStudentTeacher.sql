create database student_management1;
use student_management1;
create table student(
id int,
name1 varchar(70),
age int,
country varchar(45),
primary key(id)
);
select * from student;
create table teacher(
id int,
name1 varchar(70),
age int,
country varchar(45),
primary key(id)
);
create table class(
id int,
name1 varchar(70),
primary key(id)
);