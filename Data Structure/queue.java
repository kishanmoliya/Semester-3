import java.util.Scanner;

class enQueue{
    int front = -1;
    int rear = -1;

    int queue[] = new int[100];

    public void push(int n){
        if(rear >= 99){
            System.out.println("Queue is overFlow");
            
        }
        else{
            rear++;
        queue[rear] = n;

        if(front == -1){
            front = 0;
        }
        }
    }

    public int deQueue(){
        if(front == -1){
            System.out.println("Queue is underFlow");
            return 0;
        }
        else{
            int display = queue[front];
            if(front == rear){
                front = 0;
                rear = 0;
            }
            else{
                front++;
            }
            return display;
        }
        
    }

    public void display(){
        if(front == -1){
            System.out.println("Queue is underFlow");
        }
        else{
            int temp = front;
            while(temp <= rear){
                System.out.println(queue[temp]);
                temp ++; 
            }
        } 
    }
}

public class queue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        enQueue insert = new enQueue();

        System.out.println("Enter the num, How many element you want to push...");
        int z = sc.nextInt();

        for(int i=0;i<z;i++){
            System.out.println("Enter the number "+(i+1)+", you want to push...");
            insert.push(sc.nextInt());
        }
       // System.out.print("Youre deQueue element = "+insert.deQueue());
        insert.display();
    }
}