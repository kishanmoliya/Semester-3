import java.util.Scanner;
public class Fectoriall {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        Fectoriall fe = new Fectoriall();

        System.out.printf("Fetorial of %d is = %d",n,fe.findfectorial(n));
        
    }
    public int findfectorial(int n){
        int fectorial = 1;
        for(int i=1;i<=n;i++){
            fectorial = fectorial * i;
        }
        return fectorial; 
    }
}
