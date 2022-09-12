//Write a program to find factorial of a number. (Using Loop).
import java.util.Scanner;
public class P04_Factorial {
    public void findFactorial(int n){
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans = ans * i;
        }
        System.out.print("Factoril of " + n + " is = " + ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P04_Factorial factoril = new P04_Factorial();
        System.out.print("Enter the Number = ");
        factoril.findFactorial(sc.nextInt());
    }
}
