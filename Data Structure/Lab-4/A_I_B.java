
/* Write a program to determine if an input character string is of the form aib
i where i >= 1 i.e. 
Number of ‘a’ should be equal to number of ‘b’. 
 */
import java.util.Scanner;


class checkString{
    int top = -1;
    char stack[] = new char[100];
    int a = 0, b = 0;

    public void push(char n) {
        if (top >= 99) {
            System.out.println("Stack OverFlow");
        } else {
            top++;
            stack[top] = n;
        }
    }
    public char pop(){
        if(top <= -1){
            System.out.println("Stack UnderFlow");
        }
        char element = stack[top];
        top--;
        return element;
    }

    public void resultString(int x){
        for(int i = 0; i < x; i++){
            char element = pop();
            if(element == 'a'){
                a++;
            }
            else if(element == 'b'){
                b++;
            }
        }
        if(a == b){
            System.out.println("String is valid");
        }
        else{
            System.out.println("String is invlid!");
        }
    }
   
}


public class A_I_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkString ck = new checkString();
        System.out.print("Enter String  = ");
        String I = sc.nextLine();
        int x = I.length();

        for(int i = 0; i<x; i++){
            ck.push(I.charAt(i));
        }
        ck.resultString(x);
    }
}




