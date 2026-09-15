# Write your MySQL query statement below
select e.unique_id,o.name from Employees as o left join EmployeeUNI as e on o.id=e.id