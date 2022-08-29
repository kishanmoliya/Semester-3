import java.util.Scanner;

public class Circular_Queue {
    private int cQueueArray[];
    private int front = -1;
    private int rear = -1;

    public Circular_Queue(int n) {
        cQueueArray = new int[n];
    }

    public void cQInsert(int element) {
        if (rear >= cQueueArray.length - 1 && front == 0) {
            System.out.println("CQueue Overflow");
        } 
        else {
            if (front - 1 == rear) {
                System.out.println("CQueue Overflow");
            } else if (rear < cQueueArray.length - 1) {
                rear++;
                cQueueArray[rear] = element;
                if (front == -1) {
                    front++;
                }
            } else {
                rear = 0;
                cQueueArray[rear] = element;
            }
        }
    }

    public int cQDelete() {
        if (front == rear) {
            int extra = front;
            front = -1;
            rear = -1;
            return cQueueArray[extra];
        } else if (front < cQueueArray.length - 1) {
            front++;
            return cQueueArray[front - 1];
        } else {
            front = 0;
            return cQueueArray[cQueueArray.length - 1];
        }
    }

    public void displayQueue() {
        if (rear > front) {
            for (int i = front; i < rear + 1; i++) {
                System.out.print(cQueueArray[i] + " ");
            }
        }
        if (rear < front) {
            for (int i = front; i < cQueueArray.length; i++) {
                System.out.print(cQueueArray[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(cQueueArray[i] + " ");
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
