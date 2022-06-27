/*. Write a program to find factorial of a number. (Using Recursion) */

import java.util.Scanner;
public class Recuriconn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int fectorialValue = sc.nextInt();

        System.out.print("Factorial = "+findFectorial(fectorialValue));
    }

    static int findFectorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*findFectorial(n-1);
    }
}
