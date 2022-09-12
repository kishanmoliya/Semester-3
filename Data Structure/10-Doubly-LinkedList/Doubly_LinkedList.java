import java.util.Scanner;;
public class Doubly_LinkedList{
    int size = 0;
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
        size++;
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
        size++;
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
        size--;

        if(position == 1){
            head = head.RPTR;
            return;
        }
        else{
            Node pred = head;
            int count = 1;
            while(count < position-1){
                pred = pred.RPTR;                
                count++;
            }
            System.out.println(pred.RPTR.data);
            if(pred.RPTR == null){
                System.out.println("pre");
                pred.LPTR.RPTR = null;
                return;
            }
            Node currNode = pred.RPTR;
            pred.RPTR = currNode.RPTR;
            currNode.RPTR.LPTR = pred;
        }
    }

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
        System.out.println("Null");
    }

    public void size(){
        System.out.println("Size = " + size);
    }

    public static void main(String[] args) {
        Doubly_LinkedList dList = new Doubly_LinkedList();
        Scanner sc = new Scanner(System.in);

        dList.insertEnd(50);
        dList.insertEnd(40);
        dList.insertEnd(30);
        dList.insertEnd(20);
        dList.insertEnd(10);

        
        dList.deleteSpecified(5);
        dList.size();
        dList.displayNode();
    }
}