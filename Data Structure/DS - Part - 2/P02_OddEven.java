//Write a program to find whether a number is odd or even

import java.util.Scanner;
public class P02_OddEven{
    public void OddEven(int no){
        if(no%2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        P02_OddEven circle = new P02_OddEven();
        circle.OddEven(sc.nextInt());
    }
}