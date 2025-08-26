# Write your MySQL query statement below
select c.name as Customers
from Customers as c
Left Join  Orders as o
on c.id=o.customerId
where o.customerId Is null;
