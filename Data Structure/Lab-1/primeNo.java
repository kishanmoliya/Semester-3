import java.util.Scanner;
public class primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        int flage = 1;
        primeNo pr = new primeNo();

        if(flage == 2){
            System.out.println("Number is Not"+pr.findPrimeNo(n));
        }
        else{
            System.out.println("Number is "+pr.findPrimeNo(n));
        }
    }
   
    public int findPrimeNo(int n){
        int flage = 1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flage ++;
                break;
            }
        }
        return flage;
    }
}
