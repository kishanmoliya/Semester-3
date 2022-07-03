/* Create class Employee_Detail with attributes Employee_id, Name, Designation, and Salary. Write a 
program to read the detail from user and print it */
import java.util.Scanner;
class Employee_Details{
    Scanner sc = new Scanner(System.in);
    Scanner s = new Scanner(System.in);

    int Employee_Id;
    Double Salary;
    String Name,Designation;

    public void EmployeeDetails(){
        System.out.print("Enter the Employee_Id = ");
        Employee_Id = sc.nextInt();
        System.out.print("Enter tha Employee Name = ");
        Name = s.nextLine();
        System.out.print("Enter the Designation = ");
        Designation = s.nextLine();
        System.out.print("Enter tha Salary = ");
        Salary = sc.nextDouble();

        System.out.print("Employee_Id = "+Employee_Id);
        System.out.print("\nEmployee Name = "+Name);
        System.out.print("\nEmployee Designation = "+Designation);
        System.out.print("\nEmployee Salary = "+Salary);
    }
}

public class Employee {
    public static void main(String[] args) {
        Employee_Details em = new Employee_Details();
        em.EmployeeDetails();
    }
}
