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
        } 
        else {
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

    public int cQDelete() {
        if (front == rear) {
            int data = front;
            return cQueue[data];
        } else if (front < cQueue.length - 1) {
            front++;
            return cQueue[front - 1];
        } else {
            front = 0;
            return cQueue[cQueue.length - 1];
        }
    }

    public void displayQueue() {
        if (rear > front) {
            for (int i = front; i < rear + 1; i++) {
                System.out.print(cQueue[i] + " ");
            }
        }
        if (rear < front) {
            for (int i = front; i < cQueue.length; i++) {
                System.out.print(cQueue[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(cQueue[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Circular_Queue cq = new Circular_Queue(6);
        Scanner sc = new Scanner(System.in);

        System.out.println("1 -> cQInsert \n 2 -> cQDelete \n 3 -> Display \n 4 -> Exit");
        while (true) {
            System.out.print("Enter Operation = ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Eneter the Element You want to Insert = ");
                    cq.cQInsert(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Youre NeQueue Element is = " + cq.cQDelete());
                    break;
                case 3:
                    cq.displayQueue();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the valid Operation!");
            }
        }
    }
}
