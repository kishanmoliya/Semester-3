import java.util.Scanner;
public class LLOperation{
    Node head;
    private int size;

    LLOperation(){
        this.size = 0;
    }
    class Node{
        Object data;
        Node next;

        Node(Object data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //Add First.
    public void addFirst(Object data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next  = head;
        head = newNode;
    }

    //Add Last.
    public void addLast(Object data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    //Insert At Specific
    public void insertSpecific(Object data, int position){
        if(position < 0){
            System.out.println("Invalid Position!");
        }
        Node newNode = new Node(data);
        if(position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i = 0; i < position -1; i++){
            currNode = currNode.next;
            if(currNode == null){
                System.out.println("Position Not Found");
            }
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    //Delete First.
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        size--;
        head = head.next;
    }

    //Delete Last.
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node currNode = head.next;
        Node pred = head;
        while(currNode.next != null){
            currNode = currNode.next;
            pred = pred.next;
        }
        pred.next = null;
    }

    //Delete Specified Data.
    Object deleteSpecified(Object x){
        if(head == null){
            System.out.println("List is Empty");
            return 0;
        }
        if(head.data.equals(x)){
            Object delete = head.data;
            head = head.next;
            return delete;
        }
        Node currNode = head;
        Node pred = currNode;
        while((!currNode.data.equals(x)) && currNode.next != null){
            pred = currNode;
            currNode = currNode.next;
        }
        if(!currNode.data.equals(x)){
            System.out.println("Node is not Found");
            return 0;
        }
        if(currNode.data == null){
            pred.next = null;
            return currNode.data;
        }
        pred.next = currNode.next;
        return currNode.data;
    }

    //Delete specified Position.
    // Object deleteSpecified(Object position){
    //     if(position == 1){
    //         head = head.next;
    //     }else{
    //         Node pred = head;
    //         int count = 1;
    //         while(count < position -1){
    //             pred = pred.next;
    //             count++;
    //         }
    //         Node currNode = pred.next;
    //         pred.next = currNode.next;
    //     }
    // }

    //Size
    public int getSize(){
        return size;
    }
    
    //Display.
    public void displayList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
    //    System.out.println("Null");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        LLOperation list = new LLOperation();


        System.out.println("1 -> AddFirst \n 2 -> AddLast \n 3 -> Insert At Spacific Position \n 4 -> Delete First \n 5 -> Delete Last \n 6 -> Delete at Specific Position\n 7 -> DisplayNode \n 8 -> size of list \n 9 -> Exit");
        while(true){
            System.out.print("Enter Operation = ");
            switch(sc.next()){
                case "1" :
                    System.out.print("Enter Element You want to AddFirst = ");
                    list.addFirst(sc.next());
                    break;
                case "2" :
                    System.out.print("Enter Element you want to AddLast = ");
                    list.addLast(sc.next());
                    break;
                case "3" :
                    System.out.print("Enter the Position of New Node = ");
                    int y = sc.nextInt();
                    System.out.print("Enter the value of New Node Which you want to Insert = ");
                    Object x = sc.next();
                    list.insertSpecific(x,y);
                    break;
                case "4" :
                    list.deleteFirst();
                    System.out.println("Your First Node delete Successfully");
                    break;
                case "5" :
                    list.deleteLast();
                    System.out.println("Your Last Node delete Successfuly");
                    break;
                case "6" :
                    System.out.print("Enter the value you went delete = ");
                    list.deleteSpecified(sc.next());
                    System.out.println("Your element delete successfully");
                    break;
                case "7" :
                    list.displayList();
                    break;
                case "8" :
                    System.out.println("Size of list is = " + list.getSize());
                    break;
                case "9" :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Please enter the valid operation!");
            }
        }
    }
}
