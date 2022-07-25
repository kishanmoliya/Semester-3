import java.util.Scanner;
public class Convert_PostFix {
    static Convert_PostFix cp = new Convert_PostFix();

    char stack[] = new char[100];
    static int top = -1;

    public void push(char n) {
        if (top >= 99) {
            System.out.println("Stack is OverFlow!");
        }
        top++;
        stack[top] = n;
    }

    public char peek() {
        if (top <= -1) {
            System.out.println("Stack is uuuuuuuuuunderflow!");
            return 0;
        }
        else{
            return stack[top];
        }
        
    }

    public char pop() {
        if (top <= -1) {
            System.out.println("Stack is underFlow!");
            return 0;
        }
        top--;
        return (stack[top + 1]);
    }

    public String convertPostFix(String infix) {
        String postfixExp = "";
        char inputExp;

        for (int i = 0; i < infix.length(); i++) {
            inputExp = infix.charAt(i);

            if (Character.isLetter(inputExp)) {
                postfixExp = postfixExp + inputExp;
            } else if (inputExp == '(') {
                cp.push(inputExp);
            } else if (inputExp == ')') {
                while (cp.peek() != '(') {
                    postfixExp = postfixExp + pop();
                }
                cp.pop();
            } else {
                while (top != 1 && !(cp.peek() == '(') && precedencChack(inputExp) <= precedencChack(cp.peek())) {
                    postfixExp = postfixExp + cp.pop();
                }
                cp.push(inputExp);
            }
        }
        while (top != -1) {
            postfixExp = postfixExp + cp.pop();
        }
        return postfixExp;
    }

    public int precedencChack(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
                return 3;
        }
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the infix String = ");
        String infix = sc.nextLine();
        System.out.print("PostExpression is = " + cp.convertPostFix(infix));
    }
}






// import java.util.*;
// public class Convert_PostFix{

//     static  Convert_PostFix itp = new  Convert_PostFix();

//     static int top = -1;
//     char [] operators = new char[100];

//     public String toPostfix(String infix){
//         char symbol;
//         String postfix = "";

//         for(int i=0; i<infix.length(); i++){
//             symbol = infix.charAt(i);

//             if (Character.isLetter(symbol)){
//                 postfix += symbol;
//             }
//             else if (symbol == '('){
//                 itp.push(symbol);
//             }
//             else if ( symbol == ')' ){
//                 while(itp.peek() != '('){
//                     postfix += pop();
//                 }
//                 itp.pop();
//             }
//             else{
//                 while (top != -1 && !( itp.peek() == '(' ) && precedence(symbol) <= precedence(itp.peek())){
//                     postfix += itp.pop();
//                 } 
//                 itp.push(symbol);
//             }
//         }

//         while (top != -1) {
//             postfix += itp.pop();
//         }
//         return postfix;
//     }

//     // Pushing Operators in Stack.
//     public void push(char pushSymbol){
//         if (top >= 100){
//             System.out.println("Stack Overflow...");
//         }
//         else{
//             top++;
//             operators[top] = pushSymbol;
//         }
//     }

//     // Peek the Operators for checking precedence of Operators.
//     public char peek(){
//         if (top <= -1){
//             System.out.println("Stack Underflow...");
//             return 0;
//         }
//         else{
//             return operators[top];
//         }
//     }

//     // Pop the Opearators in Stack.
//     public char pop(){
//         if (top <= -1){
//             System.out.println("Stack Underflow...");
//             return 0;
//         }
//         return operators[top--];
//     }

//     // Check Precedence of Operators.
//     public int precedence(char op){
//         switch (op) {
//             case '+':
//             case '-':
//                 return 1;

//             case '*':
//             case '/':
//             case '%':
//                 return 2;

//             case '^':
//                 return 3;
        
//             default:
//                 break;
//         }
//         return op;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Expression : ");
//         String infix = sc.next();
//         System.out.println("Postfix Expression for the given Infix Expression is : "+itp.toPostfix(infix));
//     }
// }