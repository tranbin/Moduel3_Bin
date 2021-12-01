use student_management;
create table sinh_vien(
ma_sinh_vien int,
ten_sinh_vien varchar(70),
tuoi int,
noi_sinh_song varchar(70),
primary key(ma_sinh_vien)
);
select * from sinh_vien;
insert into sinh_vien values(1,"Tran Khanh Bin",24,"Da Nang");