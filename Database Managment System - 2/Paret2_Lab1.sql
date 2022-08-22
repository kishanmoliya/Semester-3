--1. Create INSERT, UPDATE & DELETE Stored Procedures for Person table.

-- PR_Person2_Insert 101,'Kishan',2051,'2015-06-30','Rajkot',20,'2003-06-30'
Alter Procedure PR_Person2_Insert 
	@PersonID		int,
	@PersonName		varchar(50),
	@Salary			Decimal(8,2),
	@JoiningDate	Datetime,
	@City			varchar(50),
	@Age			int,
	@BirthDate		Datetime
As
Begin
	Insert Into Person2 (
		PersonID,		
		PersonName,		
		Salary,			
		JoiningDate,
		City,			
		Age,			
		BirthDate
	)
	values(
		@PersonID,	
		@PersonName	,
		@Salary,		
		@JoiningDate,
		@City,		
		@Age,		
		@BirthDate	
	)
End	

Select * from Person2

=================================

-- PR_Person2_Update 101,'Karan',2051,'2015-06-30','Rajkot',20,'2003-06-30'
Create Procedure PR_Person2_Update 
	@PersonID		int,
	@PersonName		varchar(50),
	@Salary			Decimal(8,2),
	@JoiningDate	Datetime,
	@City			varchar(50),
	@Age			int,
	@BirthDate		Datetime
As
Begin
	Update Person2
	Set 
		PersonName	= @PersonName,		
		Salary		= @Salary,			
		JoiningDate = @JoiningDate,
		City		= @City,			
		Age		    = @Age,			
		BirthDate	= @BirthDate
			
	Where PersonId = @PersonID
End	

Select * from Person2


=============================
-- PR_Person2_Delete 101
Create Procedure PR_Person2_Delete 
	@PersonID int
As
Begin
	Delete From Person2
	Where PersonID = @PersonID
End

Select * from Person2	
--2. Create a trigger that fires on INSERT, UPDATE and DELETE operation on the Person table. For that,
--   create a new table PersonLog to log (enter) all operations performed on the Employee table.

Create Trigger TR_PersonLog_Insert
	On PersonLog
	For Insert
As
Begin
	Declare
		@PersonID		int,
		@PersonName		varchar(50)
		
	Select PersonID	     = @PersonID	  From Inserted
	Select PersonName	 = @PersonName	  From Inserted

	Insert Into Person2 Values (@PersonID,@PersonName,'Inserted')
End


--3. Create @City		an INSTEAD OF trigger that fires on INSERT, UPDATE and DELETE operation on the Person
--table. For@Age		 that, log all operation performed on the Employee table into PersonLog.
--4. Create @BirthDate	DELETE trigger on PersonLog table, when we delete any record of PersonLog table it prints
--‘Record deleted successfully from PersonLog’.
--5. Create INSERT trigger on person table, which calculates the age and update that age in Person
--table.
--Create Procedure PR_Person2_Insert