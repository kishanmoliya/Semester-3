public class LLInsert_First {
    Node head;
    class Node{
        Object data;
        Node next;

        Node(Object data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(Object data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printNode(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
    }
    public static void main(String[] args) {
        LLInsert_First list = new LLInsert_First();

        list.addFirst("2C");
        list.addFirst(251);
        list.addFirst("Kishan");

        list.printNode();
    }
}
