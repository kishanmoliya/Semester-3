//Write a program to find factorial of a number. (Using Recursion).
import java.util.Scanner;
public class P05_FactorialRecursion{
    static int findFactorial(int n){
        if(n==1 || n==0){
            return 1;
        } 
        return n*findFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int factorialValue = sc.nextInt();

        System.out.println("Factorial of " + factorialValue + " is = " + findFactorial(factorialValue));
    }
}