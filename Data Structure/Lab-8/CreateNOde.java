import java.util.Scanner;

public class CreateNOde {
    Node head;

    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insertNode(Object data){
        Node newNode = new Node(data);
        head = newNode;
        return;
    }

    public void displayData(){
        System.out.print("Your List = "+head.data);
    }

    public static void main(String[] args) {
        CreateNOde cn = new CreateNOde();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element = ");
        cn.insertNode(sc.next());
        cn.displayData();
    }
}
