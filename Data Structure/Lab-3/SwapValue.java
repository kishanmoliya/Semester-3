/* . Write a program to swap two numbers using user-defines method. */
import java.util.Scanner;
public class SwapValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();
        swapingValue(a, b);
    }

    static void swapingValue(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Tha value of a after swaping = " + a);
        System.out.println("Tha value of b after swaping = " + b);
    }
}
