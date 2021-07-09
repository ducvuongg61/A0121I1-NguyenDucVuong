select status from orders 
group by `status`;

select `status`, count(*) as soluong FROM orders
group by `status`;

select `status` , sum(quantityOrdered * priceEach) as amount FROM orders
INNER join products_have_orders 
on orders.orderNumber = products_have_orders.orderNumber
group by `status`;

select orderNumber , sum(quantityOrdered * priceEach) as total FROM products_have_orders
group by orderNumber;