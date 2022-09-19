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
        else{
            Node pred = head;
            int count = 1;
            while(count < position-1){
                pred = pred.RPTR;                
                count++;
            }
            if(pred.RPTR == tail){
                pred.RPTR = null;
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
    public static void main(String[] args) {
        Doubly_LinkedList dList = new Doubly_LinkedList();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        System.out.println("1 -> Insert Front \n 2 -> Insert End \n 3 -> Delete \n 4 -> Display \n 5 -> Display");

        while(flag){
            System.out.print("Enter Operaion = ");
            switch(sc.nextInt()){
                case 1:
                    System.out.print("Enter the Element you want to add first = ");
                    dList.InsertFront(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter the Element you want add last = ");
                    dList.insertEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter Position for delete Node = ");
                    dList.deleteSpecified(sc.nextInt());
                    System.out.print("your element is delete successfully");
                    break;
                case 4: 
                    dList.displayNode();
                    break;
                case 5:
                    flag = false;
                    break;
                default :
                    System.out.println("Enter the valid Operation!");
            }
        }
    }
}