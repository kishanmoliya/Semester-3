create table Employee_info
(
EId int,
Ename Varchar(100),
Gender Varchar(10),
JoiningDate Datetime,
Salary Decimal(8,2),
City Varchar(100)
);

Insert into Employee_info values(1,'Nick','Male','2013-Jan-01',4000,'Londan')
Insert into Employee_info values(2,'Julian','Fimal','2014-Oct-01',3000,'New York')
Insert into Employee_info values(3,'Roy','Male','2016-Jun-01',3500,'Londan')
Insert into Employee_info values(4,'Tom','Male',null,4500,'Londan')
Insert into Employee_info values(5,'Jerry','Male','2013-Feb-01',200,'Sydney')
Insert into Employee_info values(6,'Philip','Male','2015-Jan-01',7000,'New York')
Insert into Employee_info values(7,'Sara','Femal','2017-Aug-01',4800,'Sydney')
Insert into Employee_info values(8,'Wmily','Femal','2015-Jan-01',5500,'New York')
Insert into Employee_info values(9,'Michael','Male',null,6500,'Londan')
Insert into Employee_info values(10,'John','Male','2015-Jan-01',8800,'Londan')

select * from Employee_info

--1. Display all the employees whose name starts with “m” and 4 th character is “h”.
Select * from Employee_info where Ename like 'm__h%'

--2. Find the value of 3 raised to 5. Label the column as output.


--3. Write a query to subtract 20 days from the current date.


--4. Write a query to display name of employees whose name starts with “j” and contains “n” in their name.
Select Ename from Employee_info Where Ename like 'j%[n]%'

--5. Display 2nd to 9th character of the given string “SQL Programming”.
Select SUBSTRING('SQL Programming',2,9)

--6. Display name of the employees whose city name ends with “ney” &contains six characters.
Select Ename from Employee_info Where City like '___ney'

--7. Write a query to convert value 15 to string.


--8. Add department column with varchar (20) to Employee table.
Alter table Employee_info add Department Varchar(20) 

--9. Set the value of department to Marketing who belongs to London city.
Update Employee_info set Department = 'Marketing' Where City = 'Londan'

--10. Display all the employees whose name ends with either “n” or “y”.
Select Ename from Employee_info Where Ename like '%[n,y]'

--11. Find smallest integer value that is greater than or equal to 63.1, 63.8 and -63.2.


--12. Display all employees whose joining date is not available.
Select Ename from Employee_info Where JoiningDate is null

--13. Display name of the employees in capital letters and city in small letters.
Select UPPER(Ename),LOWER(City) from Employee_info 

--14. Change the data type of Ename from varchar (30) to char (30).


--15. Display city wise maximum salary.
Select City,Salary From Employee_info order by city


--16. Produce output like <Ename> works at <city> and earns <salary> (In single column).

--17. Find total number of employees whose salary is more than 5000.
Select Ename from Employee_info Where Salary>5000

--18. Write a query to display first 4 & last 3 characters of all the employees.


--19. List the city having total salaries more than 15000 and employees joined after 1st January, 2014.


--20. Write a query to replace “u” with “oo” in Ename.


--21. Display city with average salaries and total number of employees belongs to each city.


--22. Display total salaries paid to female employees.


--23. Display name of the employees and their experience in years.


--24. Remove column department from employee table.


--25. Update the value of city from syndey to null.
Update Employee_info set City = null where city = 'Sydney'