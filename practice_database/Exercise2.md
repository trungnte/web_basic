- Insert

```sh
INSERT INTO khoa values ('DD', 'Khoa Điện', '0906379110');
INSERT INTO khoa values ('XD', 'Khoa Xây Dựng', '0906379111');
INSERT INTO khoa values ('CK', 'Khoa Cơ Khí', '0906379112');
INSERT INTO khoa values ('HH', 'Khoa Hóa Học', '0906379113');
INSERT INTO khoa values ('IT', 'Khoa CNTT', '0906379114');
```

```sh
INSERT INTO monhoc values ('405401', 'Xử lý tín hiệu tương tự', 4);
INSERT INTO monhoc values ('407408', 'Cơ sở máy tính', 4);
INSERT INTO monhoc values ('400401', 'Cơ sở kỹ thuật điện - máy tính', 4);
INSERT INTO monhoc values ('003401', 'Nguyên lý tự luận', 3);
INSERT INTO monhoc values ('TR3047', 'Thiết kế kỹ thuật hàng không 1', 2);
INSERT INTO monhoc values ('EN1009', 'Vi sinh vật', 4);
INSERT INTO monhoc values ('EN4015', 'Công nghệ xanh', 2);
INSERT INTO monhoc values ('EN1013', 'Quản lý chất thải rắn và chất thải nguy hại', 4);
INSERT INTO monhoc values ('CO1009', 'Hệ thống số', 4);
INSERT INTO monhoc values ('CO1011', 'Kỹ thuật lập trình', 4);
```

```sh
INSERT INTO lop values ('DD06BK06', 'Điện tử 06', 1, 'Chính quy', 2006, 50, 'DD');
INSERT INTO lop values ('XD06BK06', 'Xây Dựng 06', 2, 'Chính quy', 2006, 40, 'XD');
INSERT INTO lop values ('CK06BK06', 'Cơ khí 06', 3, 'Chính quy', 2006, 45, 'CK');
INSERT INTO lop values ('HH06BK06', 'Hóa học 06', 4, 'Chính quy', 2006, 35, 'HH');
INSERT INTO lop values ('IT06BK06', 'CNTT 06', 5, 'Chính quy', 2006, 50, 'IT');
```

```sh
INSERT INTO sinhvien values ('10001', 'Nguyễn', 'A', '1-Mar-1990', B'1', 'HCM', 'DD06BK06');
INSERT INTO sinhvien values ('10002', 'Trần', 'B', '2-Mar-1990', B'1', 'Đồng Nai', 'XD06BK06');
INSERT INTO sinhvien values ('10003', 'Huỳnh', 'C', '3-Mar-1990', B'0', 'Long An', 'DD06BK06');
INSERT INTO sinhvien values ('10004', 'Đỗ', 'D', '4-Mar-1990', B'1', 'Bình Dương', 'HH06BK06');
INSERT INTO sinhvien values ('10005', 'Phạm', 'E', '5-Mar-1990', B'0', 'Tiền Giang', 'DD06BK06');

INSERT INTO sinhvien values ('10006', 'Nguyễn', 'F', '6-Mar-1990', B'0', 'An Giang', 'IT06BK06');
INSERT INTO sinhvien values ('10007', 'Trần', 'G', '7-Mar-1990', B'1', 'Hậu Giang', 'DD06BK06');
INSERT INTO sinhvien values ('10008', 'Huỳnh', 'H', '8-Mar-1990', B'0', 'Vũng Tàu', 'IT06BK06');
INSERT INTO sinhvien values ('10009', 'Lê', 'I', '9-Mar-1990', B'1', 'Bình Thuận', 'CK06BK06');
INSERT INTO sinhvien values ('10010', 'Hoàng', 'K', '10-Mar-1990', B'0', 'Cà Mau', 'CK06BK06');
```

```sh
INSERT INTO diemthi values ('405401', '10001', 9, 10);
INSERT INTO diemthi values ('407408', '10002', 9.5, 10);
INSERT INTO diemthi values ('400401', '10003',  9, 10);
INSERT INTO diemthi values ('003401', '10004',  9, 8.5);
INSERT INTO diemthi values ('TR3047', '10005',  9, 10);

INSERT INTO diemthi values ('EN1009', '10006',  7.6, 9.7);
INSERT INTO diemthi values ('EN4015', '10007',  9, 8.5);
INSERT INTO diemthi values ('EN1013', '10008',  8.4, 10);
INSERT INTO diemthi values ('CO1009', '10009',  9, 9.7);
INSERT INTO diemthi values ('CO1011', '10010',  8.7, 10);
```

```sh
SELECT masv,hodem, ten, 
	case gioitinh
		when B'1' then 'Nam' else 'Nữ'
	end as gioitinh
FROM sinhvien
```
