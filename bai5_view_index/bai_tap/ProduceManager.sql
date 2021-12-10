create database products; 
use products;
create table Products(
id int primary key auto_increment,
productCode varchar(20),
productName varchar(20),
productPrice double not null,
productAmount int not null, 
productDescription varchar(50),
productStatus bit default 1) ;

insert into products values 
(1,"q1","JEANS1",200000,100,"QUAN JEANS NAM1",1),
(2,"q2","JEANS2",250000,150,"QUAN JEANS NAM2",0),
(3,"q3","JEANS3",239000,140,"QUAN JEANS NAM3",1),
(4,"q4","JEANS4",225000,110,"QUAN JEANS NAM4",0),
(5,"q5","JEANS5",210000,100,"QUAN JEANS NAM5",1);

-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)

explain select * from products where productCode = "q1";

create index unique_index on products(productCode);

explain select * from products where productCode = "q1";

-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
-- Tiến hành sửa đổi view
-- Tiến hành xoá view

-- tao view
create view get_infomation_products_views as select productCode , productName , productPrice , productStatus from products;

select * from get_infomation_products_views;

-- sua doi view 

CREATE OR REPLACE VIEW get_infomation_products_views AS
SELECT productCode , productName , productPrice , productStatus from products where productStatus = 1;

-- xoa view 
DROP VIEW get_infomation_products_views;

-- store produce 
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product

DELIMITER //
create procedure display_all_info()
begin
select * from products ;
end //
DELIMITER ;

call display_all_info();

-- Tạo store procedure thêm một sản phẩm mới 

DELIMITER //
create procedure new_product(
in productCode varchar(20),
in productName varchar(20),
in productPrice double ,
in productAmount int , 
in productDescription varchar(50),
in productStatus bit) 
begin 
insert into products(productCode,productName,productPrice,productAmount,productDescription,productStatus) values
    (productCode,productName,productPrice,productAmount,productDescription,productStatus);
end //
DELIMITER ;

call new_product("q6","JEANS6",269000,160,"QUAN JEANS NAM6",0);
select * from products;

-- Tạo store procedure sửa thông tin sản phẩm theo id

DELIMITER //
create procedure edit_product(in id_edit int,
in productCode varchar(20),
in productName varchar(20),
in productPrice double ,
in productAmount int , 
in productDescription varchar(50),
in productStatus bit) 
begin 
 set SQL_SAFE_UPDATES = 0;
	update products set productCode = productCode,
	productName = productName, 
    productPrice = productPrice,
    productAmount = productAmount, 
    productDescription = productDescription, 
    productStatus = productStatus where
    Id = id_edit;
set SQL_SAFE_UPDATES = 1;
end //
DELIMITER ;

call edit_product(1,"q1","JEANS1",200000,110,"QUAN JEANS NAM1",1);
select * from products ;

-- Tạo store procedure xoá sản phẩm theo id

DELIMITER //
create procedure delete_product(in id_delete int) 
begin 
delete from products where id = id_delete;
end //
DELIMITER ;

call delete_product(1);
select * from products ;

