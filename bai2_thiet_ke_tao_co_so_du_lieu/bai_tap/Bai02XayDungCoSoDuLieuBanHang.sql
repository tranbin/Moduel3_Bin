create database QuanLyBanHang;
use QuanLyBanHang; 
create table Customer (
cId int primary key auto_increment,
cName varchar(50),
cAge int
);
create table Product (
pId int primary key auto_increment,
pName varchar(50),
pPrice int
);
create table `Order`(
oId int primary key auto_increment,
oDate date,
oTotalPrice int, 
cId int ,
foreign key(cId) references Customer(cId)	
);
select * from `Order`;
create table OrderDetail(
odQTY int CHECK ( odQTY >= 1 ) ,
oId int,
pId int,
primary key(oId,pId),
foreign key(oId) references `Order`(oId),
foreign key(pId) references  Product(pId)
);
select * from OrderDetail;