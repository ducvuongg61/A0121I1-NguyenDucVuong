use services;

alter table productlines
rename to productLines;

select * from services.productlines;

select productCode , productName , buyPrice , quanlityInStock FROM products
where buyPrice > 56.76 and quanlityInStock > 10
order by buyPrice asc;

select productCode , productName , buyPrice , textDescription
FROM products
INNER JOIN productLines ON products.productLine = productLines.productLine
where buyPrice > 56.76 and buyPrice < 95.59;

select productCode , productName , buyPrice , quanlityInStock , productVendor , productLine FROM products
where productLine = 'Classic Cars' OR productVendor = 'Min Lin Diecast';