import java.util.Scanner;
public class A_I_B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String I = sc.nextLine();
        int a=0,b=0;
        for(int i=0; i<I.length();i++){
            if(I.charAt(i) == 'a')
            a++;
            else if(I.charAt(i) == 'b')
            b++;
            else
            System.out.println("Invalid String!");
        }
        if(a == b)
        System.out.println("Valid String");
        else
        System.out.println("Invalid String!");
    }
}