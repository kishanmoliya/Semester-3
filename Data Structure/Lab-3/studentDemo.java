/* Create array of object of class Student_Detail with attributes Enrollment_no, Name, Sem, CPI for 5 
students, scan their information and print it.(Home Work)  */
import java.util.Scanner;
class student_Details{
    long Enrollment_no;
    String name;
    int sem;
    double CPI;
    Scanner sc = new Scanner(System.in);

    public void getDetails(){
       System.out.print("Enter Enroll_No = ");
       Enrollment_no = sc.nextLong();

       sc.nextLine();
       System.out.print("Enter Name = ");
       name = sc.nextLine();

       System.out.print("Enter Sem = ");
       sem = sc.nextInt();

       System.out.print("Enter CPI = ");
       CPI = sc.nextDouble();
    }
    public void printDetails(){
        System.out.print("\n"+"~~~~~Student Details~~~~~");
        System.out.println("Enrollment = "+Enrollment_no);
        System.out.println("Name = "+name);
        System.out.println("Sem = "+sem);
        System.out.println("CPI = "+CPI + "\n");
    }
}
class studentDemo{
    public static void main(String[] args) {
        student_Details st[] = new student_Details[5];
        for(int i=0; i<5;i++){
            st[i] = new student_Details();
            st[i].getDetails();
            st[i].printDetails();
        }
    }
}