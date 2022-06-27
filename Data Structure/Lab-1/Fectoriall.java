/* Write a program to find factorial of a number. (Using Loop) */

import java.util.Scanner;
public class Fectoriall {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt(); 
        System.out.printf("Fetorial of %d is = %d",n,findfectorial(n));   
    }
    static int findfectorial(int n){
        int fectorial = 1;
        for(int i=1;i<=n;i++){
            fectorial = fectorial * i;
        }
        return fectorial; 
    }
}
