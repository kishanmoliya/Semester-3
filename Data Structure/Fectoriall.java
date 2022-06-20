import java.util.Scanner;
public class Fectoriall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int fectorial = 1;
        for(int i=1;i<=n;i++){
            fectorial = fectorial * i;
        }
        System.out.println(fectorial);
    }
}
