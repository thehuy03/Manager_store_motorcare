use master 

drop database if exists DuAn1
create database DuAn1
use DuAn1
go 


create table NhanVien(
	MaNV varchar(20) primary key ,
	TenNV nvarchar(50) null,
	DienThoai varchar(10) null,
	Email varchar(50) null,
	DiaChi nvarchar(50) null,
	MatKhau varchar(50) ,
	ChucVu bit
);

create table KhachHang(
	MaKH varchar(20)primary key not null,
	TenKH nvarchar(50) not null,
	DienThoai varchar(10) null,
	DiaChi nvarchar(50),
	LoaiXe varchar(20),
	BienSo varchar(15),
	YeuCauKH ntext
);

create table Kho(
	MaLK varchar(20) primary key not null,
	TenLK nvarchar(200) not null,
	LoaiLK nvarchar(50) not null,
	HangSX nvarchar(20) not null,
	SoLuong float not null,
	DonGia float not null
);

create table DichVu(
	MaDV varchar(20) primary key ,
	TenDV nvarchar(50) not null,
	GiaDichVu float not null,
);

create table HoaDon(
	MaHD varchar(20) primary key,
	MaNV varchar(20) not null,
	MaKH varchar(20) not null,
	NgayTaoHD date null,
	ThanhTien float null,
	TrangThai bit not null
);

create table HoaDonCT(
	MaHDCT int IDENTITY(1,1) primary key,
	MaHD varchar(20) not null,
	MaDV varchar(20) not null,
	MaLK varchar(20)  null,
	SoLuong int  null,
	DonGia float  null
);




insert into NhanVien(MaNV,TenNV,DienThoai,Email,DiaChi,MatKhau,ChucVu)
values
('NV01','Lan','0912345678','Lanltps21400@email.com',N'Trường Chinh','123456',1),
('NV02','Huy','0912345678','Huydtps23265@email.com','Cộng Hòa 3 Tân Phú','12345678',0),
('NV03','Nguyen','0912345678','Nguyenvtps23265@email.com','123NguyenVanNghi','12345678',0),
('NV04','Bao','0912345678','Nguyenvtps23265@email.com','123NguyenVanNghi','12345678',0),
('NV05','Phu','0912345678','Nguyenvtps23265@email.com','123NguyenVanNghi','12345678',0);

insert into KhachHang(MaKH,TenKH,DienThoai,DiaChi,LoaiXe,BienSo,YeuCauKH)
values
('KH01','Nguyen','0912345555',N'123NguyenVanNghi','Wave','1234','N/A'),
('KH02','Lan','0912345671',N'123 Nguyễn Văn Nghi','Sirius','1321','N/A'),
('KH03','Huy','0912345672',N'456 Nguyễn Thái Sơn','Exciter','1111','N/A'),
('KH04','Bao','0912345673',N'123 Nguyễn Văn Lượng','Winner X','2222','N/A'),
('KH05','Duy','0912345674',N'123 Trường Chinh','MT09','123134','N/A');

insert into DichVu(MaDV,TenDV,GiaDichVu)
values
('DV1',N'Rửa xe cơ bản',30000),
('DV2',N'Công thay nhớt',20000),
('DV3',N'Kiểm tra và sữa chữa',40000);


insert into Kho(MaLK,TenLK,LoaiLK,HangSX,SoLuong,DonGia)
values 
('MOTUL-FACTORY(1)',N'300V FACTORY LINE ROAD RACING 5W40',N'Nhớt','Motul',100,489000),
('MOTUL-FACTORY(2)',N'300V FACTORY LINE ROAD RACING 15W50',N'Nhớt','Motul',100,489000),
('MOTUL-FACTORY(3)',N'300V² 4T FACTORY LINE 10W50',N'Nhớt','Motul',100,489000),
('MOTUL-FACTORY(4)',N'300V 4T FACTORY LINE 10W40',N'Nhớt','Motul',100,489000),
('MOTUL-7100 4T(1)',N'MOTUL 7100 4T 10W60',N'Nhớt','Motul',100,315000),
('MOTUL-7100 4T(2)',N'MOTUL 7100 4T 10W50',N'Nhớt','Motul',100,315000),
('MOTUL H-TECH',N'MOTUL H-TECH 100 4T 10W40',N'Nhớt','Motul',100,296000),
('MOTUL 3100(1)',N'MOTUL 3100 GOLD 4T 10W40',N'Nhớt','Motul',100,163000),
('MOTUL 3100(2)',N'MOTUL 3100 SILVER 4T 10W40',N'Nhớt','Motul',100,151000),
('MOTUL 3100 PLUS',N'MOTUL 3000 PLUS 4T 20W50',N'Nhớt','Motul',100,141000),
('MOTUL SCOOTER(1)',N'MOTUL SCOOTER EXPERT LE 4T 10W30',N'Nhớt','Motul',100,184000),
('MOTUL SCOOTER(2)',N'MOTUL SCOOTER LE 4T 10W40',N'Nhớt','Motul',100,184000),
('MOTUL SCOOTER(3)',N'MOTUL SCOOTER EXPERT 4T 10W-40',N'Nhớt','Motul',100,176000),
('MOTUL SCOOTER(4)',N'MOTUL SCOOTER POWER LE 5W40',N'Nhớt','Motul',100,237000),
('IPONE STROKE',N'IPONE Stroke 4 Racing 10W40',N'Nhớt','Motul',100,495000),
('IPONE KATANA(1)',N'IPONE Katana Full Power 10W30',N'Nhớt','Motul',100,385000),
('IPONE KATANA(2)',N'IPONE Katana Full Power 10W40',N'Nhớt','Motul',100,385000),
('IPONE KATANA(3)',N'IPONE Katana Scoot 0W30',N'Nhớt','Motul',100,385000),
('IPONE KATANA(4)',N'IPONE Katana Scoot 5W40',N'Nhớt','Motul',100,330000),
('YAMAHA-NSD(1)',N'Bộ nhông sên dĩa Light cho Yamaha Sirius/Jupiter xăng cơ',N'NSD','Light',100,400000),
('YAMAHA-NSD(2)',N'Bộ nhông sên dĩa Light cho Yamaha Exciter 135 đời 5 số 2011 - 2015',N'NSD','Light',100,420000),
('YAMAHA-NSD(3)',N'Bộ Nhông sên dĩa Light cho Yamaha Exciter 135 đời 4 số 2006 - 2010',N'NSD','Light',100,420000),
('YAMAHA-NSD(4)',N'Bộ Nhông sên dĩa Light cho Yamaha Exciter 150',N'NSD','Light',100,420000),
('HONDA-NSD(1)',N'Bộ Nhông sên dĩa Light cho Honda Winner',N'NSD','Light',100,430000),
('HONDA-NSD(2)',N'Bộ Nhông sên dĩa Light cho Honda Sonic',N'NSD','Light',100,430000),
('SUZUKI-NSD(1)',N'Bộ Nhông sên dĩa Light cho Satria, Raider',N'NSD','Light',100,420000),
('150-NSD(1)',N'Sên vàng Light 428HS 132 mắc 10ly',N'Sên','Light',100,270000),
('150-NSD(2)',N'Sên vàng Light 428HS 122 mắc 10ly',N'Sên','Light',100,250000),
('YAMAHA-NSD(5)',N'Nhông Recto chính hãng 15T cho Exciter',N'Nhông','Recto',100,65000),
('HONDA-NSD(3)',N'Nhông Hodaka 15T cho Winner',N'Nhông','Hodaka',100,65000),
('HONDA-NSD(4)',N'Nhông Recto chính hãng 15T cho Winner',N'Nhông','Recto',100,65000),
('SUZUKI-NSD(2)',N'Dĩa tải Saratai 43T cho Raider không Fi',N'Dĩa','Suzuki',100,43000),
('SUZUKI-NSD(3)',N'Nhông sên dĩa DID vàng cho Suzuki Raider Fi',N'NSD','DID',100,510000),
('SUZUKI-NSD(4)',N'Nhông sên dĩa DID vàng cho Suzuki Raider xăng cơ',N'NSD','DID',100,510000),
('YAMAHA-NSD(6)',N'Nhông sên dĩa DID vàng cho Yamaha FZ150i',N'NSD','DID',100,460000),
('150-NSD(3)',N'Sên vàng X1R 428S 132 mắc 9ly',N'Sên','X1R',100,300000),
('150-NSD(4)',N'Sên vàng X1R 428HPO 132 mắc 10ly',N'Sên','X1R',100,450000),
('HONDA-NSD(5)',N'Dĩa nhôm 7075 xịn 44T cho Winner',N'Dĩa','CNC',100,400000),
('HONDA-NSD(6)',N'Dĩa nhôm 7075 xịn 43T cho Sonic, Winner',N'Dĩa','CNC',100,400000),
('HONDA-NSD(7)',N'Dĩa nhôm 7075 xịn 42T cho Sonic',N'Dĩa','CNC',100,400000),
('YAMAHA-NSD(7)',N'Dĩa nhôm 7075 xịn 46T cho Exciter 155',N'Dĩa','CNC',100,400000),
('YAMAHA-NSD(8)',N'Dĩa nhôm 7075 xịn 43T cho Exciter 150',N'Dĩa','CNC',100,400000),
('YAMAHA-NSD(9)',N'Dĩa nhôm 7075 xịn 38T cho Exciter 135',N'Dĩa','CNC',100,400000),
('YAMAHA-NSD(10)',N'Dĩa nhôm 7075 xịn 39T cho Exciter 135',N'Dĩa','CNC',100,400000),
('YAMAHA-NSD(11)',N'Dĩa nhôm 7075 xịn 42T cho Exciter 135',N'Dĩa','CNC',100,400000),
('SUZUKI-NSD(5)',N'Dĩa nhôm 7075 xịn 39T cho Raider Fi, Satria Fi',N'Dĩa','CNC',100,400000),
('SUZUKI-NSD(6)',N'Dĩa nhôm 7075 xịn 38T cho Raider Fi, Satria Fi',N'Dĩa','CNC',100,400000),
('HONDA-NSD(8)',N'Dĩa nhôm 7075 xịn 36T cho Wave RS, Future Led',N'Dĩa','CNC',100,400000),
('YAMAHA-NSD(12)',N'Dĩa Recto 44T chính hãng cho Exciter 150',N'Dĩa','Recto',100,220000),
('150-NSD(5)',N'Sên RK vàng 428SB - 132L chính hãng',N'Sên','RK',100,600000),
('150-NSD(6)',N'Sên RK vàng 428SB - 124L chính hãng',N'Sên','RK',100,550000),
('150-NSD(7)',N'Sên phốt RK 428 ELO 132L',N'Sên','RK',100,490000),
('MICHELIN-CITY(1)',N'Vỏ Michelin City Extra 60/90-17',N'Vỏ/Lốp','Michelin',100,502000),
('MICHELIN-CITY(2)',N'Vỏ Michelin City Extra 70/90-17',N'Vỏ/Lốp','Michelin',100,615000),
('MICHELIN-CITY(3)',N'Vỏ Michelin City Extra 80/90-17',N'Vỏ/Lốp','Michelin',100,772000),
('Wash wax',N'Dung dịch rữa xe wash wax','Dung dịch','Wash Wax',100,50000),
('LK01',N'0','0','0',100,0);



ALTER TABLE HoaDon
ADD constraint FK_HoaDonKhachHang foreign key (MaKH) references KhachHang(MaKH),
	constraint FK_HoaDonNhanVien foreign key (MaNV) references NhanVien(MaNV);
	



alter table HoaDonCT
	add constraint FK_HDCTDichVu foreign key (MaDV) references DichVu(MaDV),
	 constraint FK_HDCT_HD foreign key (MaHD) references HoaDon(MaHD),
	 constraint FK_HDCT_Kho foreign key (MaLK) references Kho(MaLK);



create  trigger TinhTien_HDCT_insert on HoaDonCT
for insert
	as
		begin 
		 declare @MaHDCT int,  @GiaDV float ,@GiaLK float,@MaLK varchar(20),@SoLuong int
		  select @MaLK=inserted.MaLK,@SoLuong=inserted.SoLuong from inserted
			update dbo.Kho set SoLuong=SoLuong-@SoLuong where MaLK=@MaLK 
		  select @giaDV=DichVu.GiaDichVu from inserted 
			inner join DichVu on DichVu.MaDV=inserted.MaDV
		  select @GiaLK=kho.DonGia*inserted.SoLuong from inserted 
			inner join Kho on kho.MaLK=inserted.MaLK
		  select @MaHDCT=MaHDCT from inserted
			update hoadonct set DonGia=@GiaDV+@GiaLK where @MaHDCT=MaHDCT
		end;

create trigger XoaBangHD on HoaDon
 instead of delete 
	as 
		begin 
			delete from HoaDonCT
			where MaHD =(select MaHD from deleted)
			delete from HoaDon
			where MaHD =(select MaHD from deleted)
		end
		
create  trigger TinhTien_HDCT_update on HoaDonCT
 for update
	as
		begin 

		 declare @MaHDCT int,  @GiaDV float ,@GiaLK float
		  select @giaDV=DichVu.GiaDichVu from inserted 
			inner join DichVu on DichVu.MaDV=inserted.MaDV
		  select @GiaLK=kho.DonGia*inserted.SoLuong from inserted 
			inner join Kho on kho.MaLK=inserted.MaLK
		  select @MaHDCT=MaHDCT from inserted
			update hoadonct set DonGia=@GiaDV+@GiaLK where @MaHDCT=MaHDCT
		end;

create  trigger TinhTongTien_HD_insert on HoaDonCT
 for insert
	as
		begin 
			declare @MaHD varchar(20) ,@TongTien float
			select @MaHD=inserted.MaHD	from inserted
			select @TongTien=Sum(DonGia) from HoaDonCT where MaHD=@MaHD
			update Dbo.HoaDon set ThanhTien=@TongTien where HoaDon.MaHD=@MaHD
		end;
		
create  trigger TinhTongTien_HD_up on HoaDonCT
 for update
	as
		begin 
			declare @MaHD varchar(20) ,@TongTien float
			select @MaHD=inserted.MaHD	from inserted
			select @TongTien=Sum(DonGia) from HoaDonCT where MaHD=@MaHD
			update Dbo.HoaDon set ThanhTien=@TongTien where HoaDon.MaHD=@MaHD
		end;
		
create  trigger TinhTongTien_HD_Dele on HoaDonCT
 after delete
	as
		begin 
			declare @MaHD varchar(20) ,@TongTien float
			select @MaHD=deleted.MaHD	from deleted
			select @TongTien=Sum(DonGia) from HoaDonCT where MaHD=@MaHD
			update Dbo.HoaDon set ThanhTien=@TongTien where HoaDon.MaHD=@MaHD
		end;
create trigger XoaKH on KhachHang
instead of delete 
	as 
		begin
			declare @MaKH varchar(20)
			select @MaKh=deleted.MaKH from deleted
			delete from hoadon 
			where MaKH=(Select MaKH from deleted)
			delete from KhachHang
			where MaKH=(Select MaKH from deleted)
		end

