import java.util.Scanner;
public class LL_Impliment_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLOperation stack = new LLOperation();
        
        System.out.println("1 -> Insert Node \n 2 -> Delete Node \n 3 -> Display Node \n 4 -> Exit");
        while(true){
            System.out.print("Enter Operation = ");
            switch(sc.nextInt()){
                case 1 :
                    System.out.print("Enter Element you want Insert = ");
                    stack.addLast(sc.nextInt());
                    break;
                case 2 :
                    stack.deleteLast();
                    System.out.println("Youre element delete successfully");
                    break;
                case 3 :
                    stack.displayList();
                    break;
                case 4 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invaalid Opreation!");
            }
        }
    }
}
