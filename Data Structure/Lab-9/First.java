import java.lang.invoke.CallSite;
import java.util.Scanner;

public class First {
    Node head,tail;
    class Node{
        Object data;
        Node next;

        public Node(Object data){
            this.data = data;
            this.next = null;
        }
    }
    int size = 0;
    //Add First
    public void insertFront(Object data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head; 
    }

    //Delete Front
    public void deleteFront(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        size--;
        head = head.next;
    }

    //Delete Specified Position     //this case position starts with 1. 🤔
    public void deleteSpecified(int position){
        if(head == null){
            return;
        }
        if(position == 1){
            tail.next = head.next;
            return;
        }
        Node currNode = head;
        if(size == position){
            for(int i = 0; i<size-1; i++){
                currNode = currNode.next;
                currNode.next = tail;
                tail.next = head;
            }
        }
        Node pred = currNode;  
        for(int i=0;i<size;i++){
            if(i == position){
                pred = currNode;
                currNode = currNode.next;
                pred.next = currNode.next;
                return;
            }
        }   
    }

    //Insert End of the Linked list.
    public void insertEnd(Object data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        // if(head == tail){
        //     tail = newNode;
        //     head.next = newNode;
        //     tail.next = head;
        //     return;
        // }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
        return;
    }

    public void displayNode(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        Node currNode = head;
        for(int i = 0; i<size; i++){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
        // while(currNode  tail){
        //     System.out.print(currNode.data + " -> ");
        //     currNode = currNode.next;
        // }
        // System.out.println("Null");
    }

    public static void main(String[] args) {
        First cList = new First();
        // cList.insertFront(56);
        // cList.insertFront(57);
        // cList.insertFront(58);
        // cList.insertFront(59);

        // cList.delete();
        // cList.insertFront(55);

        // cList.displayNode();
        System.out.println("1 -> Insert Front \n 2 -> Insert End \n 3 -> Delete Front \n 4 -> Delete Specificed \n 5 -> Display List \n 6 -> Exit");
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.print("Enter Operation = ");
            switch(sc.nextInt()){
                case 1 :
                    System.out.print("Enter the Element You want to add Front = ");
                    cList.insertFront(sc.nextInt());
                    break;
                case 2 :
                    System.out.print("Enter the Element You want add End = ");
                    cList.insertEnd(sc.nextInt());
                    break;
                case 3 :
                    cList.deleteFront();
                    System.out.print("your element is delete successfully");
                    break;
                case 4 :
                System.out.print("Enter Position for deleting a Node = ");
                    cList.deleteSpecified(sc.nextInt());
                    System.out.println("your element is delete successfully");
                    break;
                case 5 :
                    cList.displayNode();
                    break;
                case 6 :
                    flag = false;
                    break;
                default :
                    System.out.println("Please Enter the Valid Operation!");
            }
        }
    }
}
