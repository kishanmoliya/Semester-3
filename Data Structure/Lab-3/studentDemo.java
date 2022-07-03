/* Create array of object of class Student_Detail with attributes Enrollment_no, Name, Sem, CPI for 5 
students, scan their information and print it.(Home Work)  */
class student_Details{
    long Enrollment_no;
    String name;
    int sem;
    double CPI;

    public student_Details(long Enrollment_no, String name, int sem, double CPI){
        this.Enrollment_no = Enrollment_no;
        this.name = name;
        this.sem = sem;
        this.CPI = CPI;
    }
    public void printDetails(){
        System.out.println("Enrollment = "+Enrollment_no);
        System.out.println("Name = "+name);
        System.out.println("Sem = "+sem);
        System.out.println("CPI = "+CPI);
    }
}
class studentDemo{
    public static void main(String[] args) {
        student_Details st[] = new student_Details[5];
        st[0] = new student_Details(210101128,"Kishan",3,7.91);
        st[1] = new student_Details(210101129,"Karan",3,7.00);
        st[2] = new student_Details(210101130,"Uttam",3,7.56);
        st[3] = new student_Details(210101131,"Rohan",3,7.48);
        st[4] = new student_Details(210101132,"Yash",3,7.86);

        for(int i=0;i<5;i++){
            System.out.println("~~~~~~~~~~~~Students "+(i+1)+" Details ~~~~~~~~~~~");
            st[i].printDetails();
        }
    }
}