import java.util.Scanner;

class enQueue {
    int front = -1;
    int rear = -1;

    int queue[] = new int[100];

    public void queue(int n) {
        if (rear >= 99) {
            System.out.println("Queue is overFlow");

        } else {
            rear++;
            queue[rear] = n;

            if (front == -1) {
                front = 0;
            }
        }
    }

    public int DQueue() {
        if (front == -1) {
            System.out.println("Queue is underFlow");
            return 0;
        } else {
            int display = queue[front];
            if (front == rear) {
                front = 0;
                rear = 0;
            } else {
                front++;
            }
            return display;
        }

    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is underFlow");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        enQueue insert = new enQueue();

        System.out.println("1 -> Queue" + "\n2 -> DQueue" + "\n3 -> Display" + "\n4 -> Exit");

        while (true) {
            System.out.print("Enter Operation = ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Enter Element you want to Queue = ");
                    insert.queue(sc.nextInt());
                    break;

                case 2:
                    System.out.println("Youre DQueue element is = " + insert.DQueue());
                    break;

                case 3:
                    insert.display();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.print("Please enter the valid Operation");
            }
        }
    }
}