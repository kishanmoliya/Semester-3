
/* Write a program to determine if an input character string is of the form aib
i where i >= 1 i.e. 
Number of ‘a’ should be equal to number of ‘b’. 
 */
import java.util.Scanner;

class aib {
    int top = -1;
    String stack[] = new String[25];
    int a = 0, b = 0;

    public void pushString(String I) {
        if (top >= 25) {
            System.out.println("Stack OverFlow");
        } else {
            top++;
            stack[top] = I;
        }
    }

    public void Compaire_A_B() {
        if (top <= -1) {
            System.out.println("Stack is Empty!");
        } else {
            while (top != -1) {
                // if (top == 'a') {
                // a++;
                // } else if (top == 'b') {
                // b++;
                // }
                System.out.println(stack[top]);
                top--;
            }

            // System.out.println("A = " + a);
            // System.out.println("B = " + b);
        }
    }
    // for (int i = 0; i < I.length(); i++) {
    // if (I.charAt(i) == 'a')
    // a++;
    // else if (I.charAt(i) == 'b')
    // b++;
    // }
    // if (a == b)
    // System.out.println("Valid String");
    // else
    // System.out.println("Invalid String!");
    // }
}

public class A_I_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        aib ai = new aib();
        System.out.print("Enter char  = ");
        ai.pushString(sc.nextLine());
        ai.Compaire_A_B();
    }
}