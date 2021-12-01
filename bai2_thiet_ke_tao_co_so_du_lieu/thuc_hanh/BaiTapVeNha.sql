create database btvn;
use btvn;
create table `tai_khoan` (
username varchar(15) primary key,
`password` varchar(100) not null -- là bắt buộc nhập thông tin khi thêm mới hoặc sửa 
);

create table lop_hoc(
ma_lop_hoc int primary key auto_increment,
ten_lop_hoc varchar(100)
);

create table giang_vien(
ma_giang_vien int primary key auto_increment,
ten_giang_vien varchar(100),
ngay_sinh date
);

create table hoc_vien (
-- auto_increment : tự động tăng, áp dụng cho số
ma_hoc_vien int primary key auto_increment,
ten_hoc_vien varchar(100),
ngay_sinh date,
email varchar(100),
-- unique : không trùng lặp
username varchar(15) unique,
ma_lop_hoc int,
foreign key(ma_lop_hoc) references lop_hoc(ma_lop_hoc),
foreign key(username) references tai_khoan(username)
);


create table dia_chi(
ma_dia_chi int primary key auto_increment,
dia_chi varchar (255),
ma_hoc_vien int,
foreign key(ma_hoc_vien) references hoc_vien(ma_hoc_vien)
);

create table giang_vien_day_lop_hoc(
ma_giang_vien int,
ma_lop_hoc int,
primary key(ma_giang_vien,ma_lop_hoc), -- khóa phức hợp
foreign key(ma_giang_vien) references giang_vien(ma_giang_vien),
foreign key(ma_lop_hoc) references  lop_hoc(ma_lop_hoc)
);

insert into lop_hoc values
('1','i1'),
('2','i2'),
('3','i3'),
('4','i4'),
('5','i5'),
('6','i6'),
('7','i7'),
('8','i8')
;
select * from lop_hoc;
insert into giang_vien(ten_giang_vien,ngay_sinh) values
('Nguyen A','1991-1-1'),
('Nguyen B','1992-1-1'),
('Nguyen C','1993-1-1'),
('Nguyen D','1994-1-1'),
('Nguyen E','1995-1-1'),
('Nguyen F','1996-1-1'),
('Nguyen G','1997-1-1'),
('Nguyen H','1998-1-1')
;
select * from giang_vien;

insert into hoc_vien(ten_hoc_vien,ngay_sinh,email,ma_lop_hoc) values('Huyen2','1992-1-1','abc1@gmail.com','1'),
('Huyen3','1993-1-1','abc2@gmail.com','2'),
('Huyen4','1994-1-1','abc3@gmail.com','3'),
('Huyen5','1995-1-1','abc4@gmail.com','4'),
('Huyen6','1996-1-1','abc5@gmail.com','5'),
('Huyen7','1997-1-1','abc6@gmail.com','6'),
('Huyen8','1998-1-1','abc7@gmail.com','7'),
('Huyen9','1999-1-1','abc8@gmail.com','8');
select * from hoc_vien;
insert into dia_chi(dia_chi,ma_hoc_vien) values
('Huế','1'),
('Đà nẵng','2'),
('Buôn Ma Thuột','3'),
('Lâm Đồng','4'),
('Quảng Trị','5'),
('Thanh Hóa','6'),
('Hà Tĩnh','7'),
('Nghệ An','8')
;
select * from dia_chi;
insert into giang_vien_day_lop_hoc(ma_giang_vien,ma_lop_hoc) values
('1','1'),
('2','2'),
('3','3'),
('4','4'),
('5','5'),
('6','6'),
('7','7'),
('8','8')
;
select * from giang_vien_day_lop_hoc;




