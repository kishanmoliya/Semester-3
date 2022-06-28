

public class test{
    public static void main(String[] args) {
        String a = "53";
        int len = a.length(); 
        int sum = 0;
        int rem = 0;

       int n = Integer.parseInt(a);
       int temp = n;
        while(n>0){
            rem = n%10;
            sum += (int) Math.pow(rem,len);
            n=n/10;
        }
        if(sum == temp){
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}