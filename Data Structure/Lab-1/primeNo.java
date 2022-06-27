/* Write a program to check whether a number is prime or not.  */

import java.util.Scanner;
public class primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        
        if(findPrimeNo(n) == 1){
            System.out.println("Number is Not Prime");
        }
        else{
            System.out.println("Number is Prime");
        }
    }
   
    static int findPrimeNo(int n){
        int flage = 0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flage ++;
                break;
            }
        }
        return flage;
    }
}
