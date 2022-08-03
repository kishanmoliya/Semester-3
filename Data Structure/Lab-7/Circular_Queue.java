import java.util.Scanner;

class evaluate {
    int n = 10;
    int[] s = new int[n];
    int top = -1;
    int c;

    public void push(int ans) {
        if (top >= n) {
            System.out.println("stack overflow");
        } else {
            top = top + 1;
            s[top] = ans;
        }
    }

    public int pop() {
        if (top <= -1) {
            System.out.println("stack underflow");
            return 0;
        } else {
            top = top - 1;
            return s[top + 1];
        }
    }

    public int opration(char op, int n1, int n2) {
        int a = n1;
        int b = n2;

        switch (op) {
            case '+':
                c = a + b;
                break;

            case '-':
                c = a - b;
                break;

            case '*':
                c = a * b;
                break;

            case '/':
                c = a / b;
                break;

            case '^':
                c = a ^ b;
                break;

            default:
                System.out.println("invalid!");
                break;
        }
        return c;
    }
}

public class Circular_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix Expresion:");
        String str = sc.nextLine();

        evaluate ev = new evaluate();

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);

            if (Character.isDigit(temp)) {
                int a = Character.getNumericValue(str.charAt(i));
                ev.push(a);
            } else {
                int n2 = ev.pop();
                int n1 = ev.pop();
                char op = str.charAt(i);
                int ans = ev.opration(op, n1, n2);

                ev.push(ans);
            }

        }
        int l = ev.pop();
        System.out.println("Ans = " + l);

    }
}

// import java.util.Scanner;
// public class Circular_Queue {
// int front = -1, rear = -1, count = 0;
// int CQueue[] = new int[5];

// public void cQinsert(int y){
// if(rear == 4){
// rear = 0;
// }
// else{rear++;}

// if(front == rear){
// System.out.println("OverFlow!");
// }
// else{
// CQueue[rear] = y;
// count++;
// if(front == -1){
// front = 0;
// }
// }
// }

// public int cQdelete(){
// if(front == -1){
// System.out.println("UnderFlow!");
// return 0;
// }

// int y = CQueue[front];

// if(front == rear){
// rear = -1;
// front = -1;
// return y;
// }
// if(front == 4){
// front = 0;
// }
// else{
// front++;
// count--;
// }
// return y;
// }

// public void display(){
// if(front==-1){
// System.out.println(front+"empty queue");
// return;
// }
// // for(int i=front; i<=CQueue.length-1; i++){
// // System.out.println(CQueue[i]);
// // }
// // for(int i=1; i==front; i++){
// // if(i == front){
// // return;
// // }
// // else{
// // System.out.println(CQueue[i]);
// // }
// // }
// for(int i = front;i<count;i++ ){

// System.out.println(CQueue[i]);

// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// Circular_Queue cq = new Circular_Queue();

// System.out.println("1 -> Queue" + "\n2 -> DQueue" + "\n3 -> Display" + "\n4
// -> Exit");

// while (true) {
// System.out.print("Enter Operation = ");
// switch (sc.nextInt()) {
// case 1:
// System.out.print("Enter Element you want to Enter = ");
// cq.cQinsert(sc.nextInt());
// break;

// case 2:
// System.out.println("Youre DQueue element is = " + cq.cQdelete());
// break;

// case 3:
// cq.display();
// break;

// case 4:
// System.exit(0);
// break;

// default:
// System.out.print("Please enter the valid Operation");
// }
// }
// }
// }

// import java.util.*;
// public class Circular_Queue {
// Object[] Queue = new Object[6];
// int front=-1;
// int rear=-1;
// int reset =0;
// void insert(Object y){
// if(rear==5){
// int temp=rear;
// rear=0;
// if(front!=0){
// rear=-1;
// }
// else{
// rear=temp;
// System.out.println("queue overflow");
// return;
// }

// }

// rear++;
// if(front==rear){
// System.out.println("queue overflow");
// rear--;
// return;
// }
// Queue[rear]=y;
// reset++;
// if(front==-1){
// front=0;
// System.out.println("hii");
// }
// }
// Object delete(){
// if(front==-1){
// System.out.print("Queue underflow");
// return 00;
// }
// Object y = Queue[front];
// if(front==rear){
// front=-1;
// rear=-1;
// System.out.println("iam -1");
// return y;
// }
// if(front==5){
// front=0;
// }
// else {
// front++;
// reset--;
// }
// return y;
// }
// void display(){
// if(front==-1){
// System.out.println(front+"empty queue");
// return;
// }
// System.out.print("[");
// for(int i=front,j=0;j<reset;i++,j++){
// System.out.print(Queue[i]+",");
// if(i==5&& front!=0){
// i=-1;
// }
// }
// System.out.println("]");
// }
// public static void main(String[] args) {
// Circular_Queue cq = new Circular_Queue();
// Scanner sc = new Scanner(System.in);

// boolean flag = true;
// while (flag){
// System.out.print("1 : push element in Queue\n2 : delete element in queue\n3 :
// display stack\n4 : exit\noperation : ");
// int y = sc.nextInt();
// switch (y){
// case 1 :
// System.out.print("enter element : ");
// cq.insert(sc.nextInt());
// break;
// case 2 :
// System.out.println("remove first element : "+cq.delete());

// break;
// case 3 :
// cq.display();
// break;
// case 4 :
// flag = false;
// break;
// default:
// System.out.println("your choice invalid");
// }
// }

// }
// }
