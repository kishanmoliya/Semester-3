import java.util.Scanner;
class evaluate {
    int[] stack = new int[25];
    int top = -1;
    int c;

    public void push(int n) {
        if (top >= 24) {
            System.out.println("stack overflow");
        } else {
            top++;
            stack[top] = n;
        }
    }

    public int pop() {
        if (top <= -1) {
            System.out.println("stack underflow");
            return 0;
        } else {
            top --;
            return stack[top + 1];
        }
    }

    public int opration(char op, int n1, int n2) {
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
                c = n1 ^ n2;
                break;

            default:
                System.out.println("invalid!");
                break;
        }
        return c;
    }
    public void convert_postfix(String postfix){
        for (int i = 0; i < postfix.length(); i++) {
            char temp = postfix.charAt(i);

            if (Character.isDigit(temp)) {
                int a = Character.getNumericValue(postfix.charAt(i));
                push(a);
            } else {
                int n2 = pop();
                int n1 = pop();
                char op = postfix.charAt(i);
                int ans = opration(op, n1, n2);

                push(ans);
            }
        }
        System.out.println("Ans = "+pop());
    }
}

public class PostFix_Evaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix Expresion:");
        String postfix = sc.nextLine();
        evaluate pos = new evaluate();
        pos.convert_postfix(postfix);
    }
}
