JDBC2

SELECT c.Name Loai, p.Name SanPham, UnitPrice Gia
	FROM Products p 
	JOIN Categories c ON c.Id=p.CategoryId
	ORDER BY Loai
	
SELECT * FROM Categories ORDER BY RANDOM() LIMIT 10;
SELECT * FROM Categories;

SELECT c.NameVN, p.Name, p.UnitPrice 
	FROM Products p RIGHT JOIN Categories c ON c.Id = p.CategoryId;

# Chon ra cac record tu Categories ma chua co san pham (products)

SELECT  c.* FROM Categories c LEFT JOIN Products p ON c.Id = p.CategoryId
	WHERE p.Id IS NULL

# Cach viet nay cung ket qua voi cau tren nhung xu ly cham hon! Khong nen viet nhu the nay
SELECT * FROM Categories WHERE Id NOT IN (SELECT CategoryID FROM Products)
	
	