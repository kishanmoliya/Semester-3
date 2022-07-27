// import java.util.Scanner;

// public class Convert_PostFix {
//     int inputPrecedence,stackPrecedence,r;

//     char[] stack = new char[10];
//     int top = 0,rank=0;
//     String polish= "";

//     public void setPrecedence(char input,char stack){
//         switch (input) {
//             case '+', '-' -> inputPrecedence = 1;
//             case '*', '/' -> inputPrecedence = 3;
//             case '^' -> inputPrecedence = 6;
//             case '(' -> inputPrecedence = 9;
//             case ')' -> inputPrecedence = 0;
//             default -> inputPrecedence = 7;
//         }
//         switch (stack) {
//             case '+', '-' -> {stackPrecedence = 2;r = -1;}
//             case '*', '/' -> {stackPrecedence = 4;r = -1;}
//             case '^' -> {stackPrecedence = 5;r = -1;}
//             case '(' -> {stackPrecedence = 0;r = -1;}
//             case ')' -> {stackPrecedence = -1;r = -1;}
//             default -> {stackPrecedence = 8;r = 1;}
//         }
//     }

//     public String  checkString(String infix){
//         stack[top]='(';

//         for(int i=0;i<infix.length();i++){
//             char IP = infix.charAt(i);
//             char SP = stack[top];
//             setPrecedence(IP,SP);

//             if(top<0){
//                 System.out.println("Envalid String");
//             }

//             while (stackPrecedence>inputPrecedence){
//                 char temp=stack[top];
//                 polish+=(temp);
//                 top--;
//                 rank= rank+ r;
//                 if(rank<1){return("Envalid String");}
//                 SP = stack[top];
//                 setPrecedence(IP,SP);
//             }

//             if(stackPrecedence!=inputPrecedence){
//                 top++;
//                 stack[top]=IP;
//             }
//             else {
//                 top--;
//             }
//         }

//         if((top != -1) || (rank!=1)) {return ("Envalid String");}
//         return (polish);
//     }

//     public static void main(String[] args) {
//         Convert_PostFix ItoP = new Convert_PostFix();
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter String : ");
//         String infix = sc.nextLine();
//         System.out.println(ItoP.checkString(infix+')'));
//     }
// }

import java.util.Scanner;

class converting {
    int stackPrecedence;
    int inputPrecedence;
    int r;
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

    public void precedenceChack(char stack, char input) {
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
            case '('            -> {stackPrecedence = 0;r = -1;}
            case ')'            -> {stackPrecedence = -1;r = -1;}
            default             -> {stackPrecedence = 8;r = 1;}
        }
    }

    public String evaluating(String infixchar) {
        int str = infixchar.length();
        stack[top] = '(';

        for (int i = 0; i < str; i++) {
            char next = infixchar.charAt(i);
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

        if ((top != -1) || (rank != 1)) {
        return ("IInvalid String");
        }
        return (polish);
    }
}

public class Convert_PostFix {
    public static void main(String[] args) {
        converting con = new converting();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Infix Expration = ");
        String infix = sc.nextLine();
        System.out.println("PostFix Expration is = " + con.evaluating(infix + ')'));
    }
}

// import java.util.Scanner;
// public class Convert_PostFix {
// static Convert_PostFix cp = new Convert_PostFix();

// char stack[] = new char[100];
// static int top = -1;

// public void push(char n) {
// if (top >= 99) {
// System.out.println("Stack is OverFlow!");
// }
// top++;
// stack[top] = n;
// }

// public char peek() {
// if (top <= -1) {
// System.out.println("Stack is uuuuuuuuuunderflow!");
// return 0;
// }
// else{
// return stack[top];
// }
// }

// public char pop() {
// if (top <= -1) {
// System.out.println("Stack is underFlow!");
// return 0;
// }
// top--;
// return (stack[top + 1]);
// }

// public String convertPostFix(String infix) {
// String postfixExp = "";
// char inputExp;

// for (int i = 0; i < infix.length(); i++) {
// inputExp = infix.charAt(i);

// if (Character.isLetter(inputExp)) {
// postfixExp = postfixExp + inputExp;
// } else if (inputExp == '(') {
// cp.push(inputExp);
// } else if (inputExp == ')') {
// while (cp.peek() != '(') {
// postfixExp = postfixExp + pop();
// }
// cp.pop();
// } else {
// while (top != 1 && !(cp.peek() == '(') && precedencChack(inputExp) <=
// precedencChack(cp.peek())) {
// postfixExp = postfixExp + cp.pop();
// }
// cp.push(inputExp);
// }
// }
// while (top != -1) {
// postfixExp = postfixExp + cp.pop();
// }
// return postfixExp;
// }

// public int precedencChack(char ch) {
// switch (ch) {
// case '+':
// case '-':
// return 1;
// case '*':
// case '/':
// case '%':
// return 2;
// case '^':
// return 3;
// }
// return ch;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the infix String = ");
// String infix = sc.nextLine();
// System.out.print("PostExpression is = " + cp.convertPostFix(infix));
// }
// }

// // import java.util.*;
// // public class Convert_PostFix{

// // static Convert_PostFix itp = new Convert_PostFix();

// // static int top = -1;
// // char [] operators = new char[100];

// // public String toPostfix(String infix){
// // char symbol;
// // String postfix = "";

// // for(int i=0; i<infix.length(); i++){
// // symbol = infix.charAt(i);

// // if (Character.isLetter(symbol)){
// // postfix += symbol;
// // }
// // else if (symbol == '('){
// // itp.push(symbol);
// // }
// // else if ( symbol == ')' ){
// // while(itp.peek() != '('){
// // postfix += pop();
// // }
// // itp.pop();
// // }
// // else{
// // while (top != -1 && !( itp.peek() == '(' ) && precedence(symbol) <=
// precedence(itp.peek())){
// // postfix += itp.pop();
// // }
// // itp.push(symbol);
// // }
// // }

// // while (top != -1) {
// // postfix += itp.pop();
// // }
// // return postfix;
// // }

// // // Pushing Operators in Stack.
// // public void push(char pushSymbol){
// // if (top >= 100){
// // System.out.println("Stack Overflow...");
// // }
// // else{
// // top++;
// // operators[top] = pushSymbol;
// // }
// // }

// // // Peek the Operators for checking precedence of Operators.
// // public char peek(){
// // if (top <= -1){
// // System.out.println("Stack Underflow...");
// // return 0;
// // }
// // else{
// // return operators[top];
// // }
// // }

// // // Pop the Opearators in Stack.
// // public char pop(){
// // if (top <= -1){
// // System.out.println("Stack Underflow...");
// // return 0;
// // }
// // return operators[top--];
// // }

// // // Check Precedence of Operators.
// // public int precedence(char op){
// // switch (op) {
// // case '+':
// // case '-':
// // return 1;

// // case '*':
// // case '/':
// // case '%':
// // return 2;

// // case '^':
// // return 3;

// // default:
// // break;
// // }
// // return op;
// // }

// // public static void main(String[] args) {
// // Scanner sc = new Scanner(System.in);
// // System.out.print("Enter the Expression : ");
// // String infix = sc.next();
// // System.out.println("Postfix Expression for the given Infix Expression is :
// "+itp.toPostfix(infix));
// // }
// // }