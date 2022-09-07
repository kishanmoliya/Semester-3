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

    //Insert Front 🛂
    public void InsertFront(Object data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        head.LPTR = newNode;
        newNode.RPTR = head;
        head = newNode;        
    }
    public static void main(String[] args) {
        Doubly_LinkedList dList = new Doubly_LinkedList();
        Scanner sc = new Scanner(System.in);

        dList.InsertFront(50);
        dList.InsertFront(40);
        dList.InsertFront(30);

        System.out.println();
    }
}