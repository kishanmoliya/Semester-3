import java.util.Scanner;
   
public class Convert_PostFix {
    int stackPrecedence,inputPrecedence,r;
    int top = 0, rank = 0;
    String polish = "";
    char stack[] = new char[50];

    public void push(char n) {
        if (top >= 49) {
            System.out.println("Stack Overflow");
        }
        top++;
        stack[top] = n;
    }

    public char pop() {
        if (top <= 0) {
            System.out.println("Stack is underFlow!");
            return 0;
        }
        top--;
        return (stack[top + 1]);
    }

    public void precedenceChack(char input, char stack) {
        switch (input) {
            case '+', '-'       -> inputPrecedence = 1;
            case '*', '/', '%'  -> inputPrecedence = 3;
            case '^'            -> inputPrecedence = 6;
            case '('            -> inputPrecedence = 9;
            case ')'            -> inputPrecedence = 0;
            default             -> inputPrecedence = 7;
        }
        switch (stack) {
            case '+', '-'       -> {stackPrecedence = 2;r = -1;}
            case '*', '/', '%'  -> {stackPrecedence = 4;r = -1;}
            case '^'            -> {stackPrecedence = 5;r = -1;}
            case '('            -> {stackPrecedence = 0;}
            default             -> {stackPrecedence = 8;r = 1;}
        }
    }

    public String evaluating(String infix) {
        int str = infix.length();
        stack[top] = '(';

        for (int i = 0; i < str; i++) {
            char next = infix.charAt(i);
            char st = stack[top];
            precedenceChack(next, st);

            if (top < 0) {
                System.out.println("Invalid String");
            }

            while (stackPrecedence > inputPrecedence) {
                char temp = pop();
                polish += temp;
                rank += r;

                if (rank < 1) {
                    System.out.println("Invalid");
                }
                st = stack[top];
                precedenceChack(next, st);
            }

            if (stackPrecedence != inputPrecedence) {
                push(next);
            } else {
                pop();
            }
        }

        System.out.println("rank is = "+rank);

        // if ((top != -1) || (rank != 1)) {
        // return ("IInvalid String");
        // }
        return (polish);
    }
    public static void main(String[] args) {
        Convert_PostFix con = new Convert_PostFix();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Infix Expration = ");
        String infix = sc.nextLine();
        System.out.println("PostFix Expration is = " + con.evaluating(infix + ')'));
    }
}