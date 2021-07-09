select customers.customerNumber , customerName , phone , paymentDate , amount FROM customers
inner join payments 
on customers.customerNumber = payments.customerNumber
where city = 'Las Vegas';

select customers.customerNumber , customers.customerName , orders.orderNumber , orders.`status` FROM customers
left join orders 
on customers.customerNumber = orders.customerNumber;

select customers.customerNumber , customers.customerName , orders.orderNumber , orders.`status` FROM customers
left join orders 
on customers.customerNumber = orders.customerNumber
where orders.orderNumber is null;