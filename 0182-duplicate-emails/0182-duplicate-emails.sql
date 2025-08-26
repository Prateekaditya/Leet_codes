# Write your MySQL query statement below
Select email as Email 
from Person 
group by email
Having COUNT(email)>1
;