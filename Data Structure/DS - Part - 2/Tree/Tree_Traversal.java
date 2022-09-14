import java.util.Scanner;
class Node{
    Node left;
    Node right;
    Object data;

    public Node(Object data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Tree{
    Node root;
    public void insert(Object data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
        }
    }
}
public class Tree_Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree tree = new Tree();
    }
}
