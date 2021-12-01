create database quan_ly_dat_hang;
use quan_ly_dat_hang;
create table phieu_xuat(
so_px int primary key auto_increment,
ngay_xuat date
);
create table phieu_nhap(
so_phieu_nhap int primary key auto_increment,
ngay_nhap date
);
create table nha_cung_cap(
ma_ncc  int primary key auto_increment,
ten_ncc varchar(50),
dia_chi varchar(100),
sdt varchar(15)
);
create table don_dh(
so_dh int primary key auto_increment,
ngay_dh date
);
create table vat_tu(
ma_vtu int primary key auto_increment,
ten_vtu varchar(20),
so_px int unique,
so_phieu_nhap int,
so_dh int,
foreign key(so_px) references phieu_xuat(so_px),
foreign key(so_phieu_nhap) references phieu_nhap(so_phieu_nhap),
foreign key(so_dh) references don_dh(so_dh)
);
create table chi_tiet_phieu_nhap(
sl_xuat int ,
dg_xuat varchar(20),
so_px int , 
ma_vtu int ,
foreign key(so_px) references phieu_xuat(so_px),
foreign key(ma_vtu) references vat_tu(ma_vtu)
);
create table chi_tiet_phieu_xuat
(
sl_nhap int ,
dg_nhap varchar(20),
so_phieu_nhap int , 
ma_vtu int ,
foreign key(so_phieu_nhap) references phieu_nhap(so_phieu_nhap),
foreign key(ma_vtu) references vat_tu(ma_vtu)
);
create table chi_tiet_don_dat_hang(
ma_vtu int ,
so_dh int,
primary key(ma_vtu,so_dh),
foreign key(ma_vtu) references vat_tu(ma_vtu),
foreign key(so_dh) references  don_dh(so_dh)
);
create table cung_cap(
ma_ncc  int, 
so_dh int,
foreign key(ma_ncc) references  nha_cung_cap(ma_ncc),
foreign key(so_dh) references  don_dh(so_dh)
);