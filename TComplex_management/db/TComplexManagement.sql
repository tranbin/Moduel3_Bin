create database TComplexManagement;
use TComplexManagement;

create table TComplex(
ma_mat_bang int primary key auto_increment,
dien_tich int,
trang_thai int,
tang int,
loai_van_phong bit not null,
mo_ta varchar(100),
gia_cho_thue int,
ngay_bat_dau date not null,
ngay_ket_thuc date not null);

select * from TComplex;
select * from TComplex where gia_cho_thue = 20000000 and tang = 1 and loai_van_phong = 1; 
insert into TComplex(dien_tich,trang_thai,tang,loai_van_phong,mo_ta,gia_cho_thue,ngay_bat_dau,ngay_ket_thuc) 
values(1000,1,1,1,"Tiện Nghi",20000000,"1970-11-07","2000-11-08");