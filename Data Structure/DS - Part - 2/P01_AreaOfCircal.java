//Write a program to calculate area of a Circle
import java.util.Scanner;
public class P01_AreaOfCircal{
    public void findArea(double r){
        double area = Math.PI * r * r;
        System.out.println("Area of the Circle is = " + area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr Readis = ");
        double r = sc.nextDouble();
        P01_AreaOfCircal circle = new P01_AreaOfCircal();
        circle.findArea(r);
    }
}