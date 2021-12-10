use demo_a07;
-- index
explain select * from hoc_vien where ten_hoc_vien = "HaiTT";

create index idx_ten_hoc_vien on hoc_vien(ten_hoc_vien);

explain select * from hoc_vien where ten_hoc_vien = "HaiTT";

drop index idx_ten_hoc_vien on hoc_vien;

-- View
create view hoc_vien_view as 
select hoc_vien.ma_hoc_vien, hoc_vien.ten_hoc_vien from hoc_vien;

create view giang_vien_view as
select giang_vien.ma_giang_vien, giang_vien.ten_giang_vien from giang_vien;

select * from hoc_vien_view;

insert into hoc_vien_view value (7,"G");

insert into giang_vien_view value (4,"ChienTM");

select * from giang_vien_view;

-- sp.
-- yêu cầu 1: Tìm kiếm theo tên là tham số truyền vào
DELIMITER //
create procedure find_all_student_by_name(in ten_hoc_vien varchar(255))
begin
select * from hoc_vien where hoc_vien.ten_hoc_vien = ten_hoc_vien;
end //
DELIMITER ;

call find_all_student_by_name("C");

-- yêu cầu 2: lấy ra tổng số học viên đnag theo học
DELIMITER //
create procedure sp_count_all_student(out tong_so int)
begin
set tong_so = (select count(ma_hoc_vien) from hoc_vien);
end //
DELIMITER ;

call sp_count_all_student(@abc);
select @abc;

-- Yêu cầu 3: lấy ra tổng số học sinh có mã học viên lớn hơn 1 tham số truyền vào
DELIMITER //
create procedure sp_count_all_student_by_id(inout temp int)
begin
set temp = (select count(ma_hoc_vien) from hoc_vien where hoc_vien.ma_hoc_vien>temp);
end //
DELIMITER ;

set @abc = 5;
call sp_count_all_student_by_id(@abc);
select @abc;


-- Trigger
DELIMITER //
create trigger before_create_student before insert on hoc_vien
for each row
begin
insert into tai_khoan set username = new.username, password ="123123";
end //
DELIMITER ;

drop trigger before_create_student;

insert into hoc_vien(ma_hoc_vien,ten_hoc_vien,ngay_sinh,username) value (9, "LinhTD", "1990-12-12","LinhTD");

DELIMITER //

create function sum_a_b(a int, b int) returns int 
READS SQL DATA
DETERMINISTIC
begin
declare sum int;
set sum = a+b;
return sum;
end //
DELIMITER ;

select sum_a_b(4,5);