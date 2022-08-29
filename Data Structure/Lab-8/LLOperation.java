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

        Node pred = head;
        Node currNode = head.next;
        while(currNode.next != null){
            currNode = currNode.next;
            pred = pred.next;
        }
        pred.next = null;
    }

    //Delete Index.
    // public void deleteIndex(Object x){
    //     Node currNode = head;
    //     Node pred = head;
    //     while(!currNode.data.equals(x) || currNode.next != null){
    //         pred = currNode;
    //         currNode = currNode.next;
    //     }        
    //     if(!currNode.equals(x)){
    //         System.out.println("Node not Found");
    //         return;
    //     }

    //     if(x == head){
    //         head = currNode.next;
    //     }
    //     else{
    //         pred.next = currNode.next;
    //     }
    //     currNode.next = null; 
    // }

    Object deleteSpecified(Object x){
        if(head == null){
            System.out.println("List is Empty");
            return 0;
        }
        if(head.data.equals(x)){
            Object free = head.data;
            head = head.next;
            return free;
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
        pred.data = currNode.next;
        return currNode.data;
    }

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


        System.out.println("1 -> AddFirst \n 2 -> AddLast \n 3 -> Delete First \n 4 -> Delete Last \n 5 -> Delete at Specific Position\n 6 -> DisplayNode \n 7 -> size of list \n 8-> Exit");
        while(true){
            System.out.print("Enter Operation = ");
            switch(sc.nextInt()){
                case 1 :
                    System.out.print("Enter Element You want to AddFirst = ");
                    list.addFirst(sc.nextInt());
                    break;
                case 2 :
                    System.out.println("Enter Element you want to AddLast");
                    list.addLast(sc.nextInt());
                    break;
                case 3 :
                    list.deleteFirst();
                    System.out.println("Youre First Node delete Successfully");
                    break;
                case 4 :
                    list.deleteLast();
                    System.out.println("Youre Last Node delete Successfuly");
                    break;
                case 5 :
                    System.out.print("Enter the value you went delete = ");
                    list.deleteSpecified(sc.nextInt());
                    System.out.println("Youre element delete successfully");
                    break;
                case 6 :
                    list.displayList();
                    break;
                case 7 :
                    System.out.println("Size of list is = " + list.getSize());
                    break;
                case 8 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Please enter the valid operation!");
            }
        }
    }
}
