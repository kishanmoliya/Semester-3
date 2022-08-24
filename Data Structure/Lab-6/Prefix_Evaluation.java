import java.util.Scanner;
class evaluate {
    int[] stack = new int[25];
    int top = -1;
    int c;

    public void push(int ans) {
        if (top >= 24) {
            System.out.println("stack overflow");
        } else {
            top++;
            stack[top] = ans;
        }
    }

    public int pop() {
        if (top <= -1) {
            System.out.println("stack underflow");
            return 0;
        } else {
            top--;
            return stack[top + 1];
        }
    }

    public int opration(char op, int n2, int n1) {
        switch (op) {
            case '+':
                c = n1 + n2;
                break;

            case '-':
                c = n1 - n2;
                break;

            case '*':
                c = n1 * n2;
                break;

            case '/':
                c = n1 / n2;
                break;

            case '^':
                c = (int) Math.pow(n1, n2);
                break;


            default:
                System.out.println("invalid!");
                break;
        }
        return c;
    }
    public void convert_Prefix(String Prefix){
        for (int i = Prefix.length()-1; i >= 0 ; i--) {
            char temp = Prefix.charAt(i);

            if (Character.isDigit(temp)) {
                int a = Character.getNumericValue(Prefix.charAt(i));
                push(a);
            } else {
                int n2 = pop();
                int n1 = pop();
                char op = Prefix.charAt(i);
                int ans = opration(op, n1, n2);

                push(ans);
            }
        }
        System.out.println("Ans = "+pop());
    }
}

public class Prefix_Evaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Prefix Expresion:");
        String Prefix = sc.nextLine();
        evaluate ios = new evaluate();
        ios.convert_Prefix(Prefix);
    }
}
