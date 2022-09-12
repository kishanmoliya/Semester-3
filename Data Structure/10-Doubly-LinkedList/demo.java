import java.util.Scanner

class demo
{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter t = ");
		long t = sc.nextInt();
		
		while(t-- > 0){
		    long count = 0;
            System.out.print("Enter a = ");
		    long a = sc.nextInt();
		    
		    while(a > 5){
                System.out.println("Hello");
		        long ans = a/5;
		        count = count + ans;
                System.out.println(count);
                a = ans;
		    }
            System.out.println("Good morning");
		    System.out.println(count);
		}
	}
}
