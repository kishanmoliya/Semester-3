public class LLInsert_Last {
    Node head;
    class Node{
        Object data;
        Node next;

        Node(Object data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(Object data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printNode(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        LLInsert_Last list = new LLInsert_Last();

        list.addLast("kishan");
        list.addLast(251);
        list.addLast("2C");
        list.addLast("ENroll = 21010101128");

        list.printNode();
    }
}
