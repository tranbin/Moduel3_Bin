use btvn;
select * from dia_chi;
select * from hoc_vien;
select * from lop_hoc;
-- nối 2 bảng
select * from dia_chi inner join hoc_vien on dia_chi.ma_hoc_vien = hoc_vien.ma_hoc_vien; 
-- nối bên phải
select * from lop_hoc right join hoc_vien on hoc_vien.ma_lop_hoc = lop_hoc.ma_lop_hoc;
insert into hoc_vien(ten_hoc_vien,ngay_sinh) values ("Huyen0","2000-1-1");
insert into hoc_vien(ten_hoc_vien,ngay_sinh,ma_lop_hoc) values ("Huyen0","2000-1-1",'1');
-- nối bên trái 
select * from  hoc_vien left join lop_hoc on lop_hoc.ma_lop_hoc =  hoc_vien.ma_lop_hoc;
-- hiển thị tên có tên là Huyen0
select * from hoc_vien where hoc_vien.ten_hoc_vien = "Huyen0";
-- hiển thị thông tin học sinh có tên có số 0
select * from hoc_vien where hoc_vien.ten_hoc_vien like "%0%";
-- đếm sl học viên của từng lớp
select count(ma_hoc_vien), ma_lop_hoc from hoc_vien group by ma_lop_hoc;
-- hiển thị sl học viên các lớp có trên 2 thành viên
select count(ma_hoc_vien) as 'number_hoc_vien', ma_lop_hoc from hoc_vien 
group by ma_lop_hoc having number_hoc_vien >=2;
-- sắp xếp tăng dần
select * from hoc_vien order by ten_hoc_vien desc; 

