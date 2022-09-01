import java.util.Scanner;

public class Circular_Queue {
    public int cQueue[];
    public int front = -1;
    public int rear = -1;

    public Circular_Queue(int n) {
        cQueue = new int[n];
    }

    public void cQInsert(int element) {
        if (rear >= cQueue.length - 1 && front == 0) {
            System.out.println("CQueue Overflow");
        } else {
            if (front - 1 == rear) {
                System.out.println("CQueue Overflow");
            } else if (rear < cQueue.length - 1) {
                rear++;
                cQueue[rear] = element;
                if (front == -1) {
                    front++;
                }
            } else {
                rear = 0;
                cQueue[rear] = element;
            }
        }
    }

    public int dequeue() {
        if (front <= -1) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            int temp = cQueue[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % (cQueue.length);
            }
            return temp;
        }
    }

    public void displayQueue() {
        if (front <= -1) {
            System.out.println("Queue Underflow");
        } else {
            int i = front;
            System.out.println("front : " + front);
            System.out.println("rear : " + rear);
            System.out.print("Items : ");
            while (i != rear) {
                System.out.print("[" + cQueue[i] + "] ");
                i = (i + 1) % (cQueue.length);
            }
            System.out.println("[" + cQueue[rear] + "] ");
        }
    }

    public static void main(String[] args) {
        Circular_Queue cq = new Circular_Queue(6);
        Scanner sc = new Scanner(System.in);

        System.out.println("1 -> cQInsert \n 2 -> cQDelete \n 3 -> Display \n 4 -> Exit");
        while (true) {
            System.out.print("Enter Operation = ");
            switch (sc.next()) {
                case "1":
                    System.out.print("Eneter the Element You want to Insert = ");
                    cq.cQInsert(sc.nextInt());
                    break;
                case "2":
                    System.out.println("Your EnQueue Element is = " + cq.dequeue());
                    break;
                case "3":
                    cq.displayQueue();
                    System.out.println();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the valid Operation!");
            }
        }
    }
}
