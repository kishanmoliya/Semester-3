import java.util.Scanner;;
public class Doubly_LinkedList{
    class Node{
        Object data;
        Node LPTR = null;
        Node RPTR = null;

        public Node(Object data){
            this.data = data;
            this.LPTR = null;
            this.RPTR = null;
        }
    }
    Node head;
    Node tail;

    //Insert Front
    public void InsertFront(Object data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        head.LPTR = newNode;
        newNode.RPTR = head;
        head = newNode;        
    }

    //Insert End
    public void insertEnd(Object data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        if(head.RPTR == null){
            head.RPTR = newNode;
            newNode.LPTR = head;
            tail = newNode;
            return;
        }
        tail.RPTR = newNode;
        newNode.LPTR = tail;
        tail = newNode;     
    }

    //Delete At Possition
    public void deleteSpecified(int position){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        if(position == 1){
            head = head.RPTR;
            return;
        }
    }
    //     Node currNode = head;
    //     while(currNode != null){
            
    //         tail = tail.LPTR;
    //         tail.RPTR = null;
    //         currNode  = null;
    //         return;
    //     }
    // }

    //Display
    public void displayNode(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        Node currNOde = head;
        while(currNOde != null){
            System.out.print(currNOde.data + " -> ");
            currNOde = currNOde.RPTR;
        }

    }

    public static void main(String[] args) {
        Doubly_LinkedList dList = new Doubly_LinkedList();
        Scanner sc = new Scanner(System.in);

        dList.insertEnd(50);
        dList.insertEnd(40);
        dList.insertEnd(30);
        dList.insertEnd(20);
        dList.insertEnd(10);

        dList.deleteSpecified();

        dList.displayNode();
    }
}