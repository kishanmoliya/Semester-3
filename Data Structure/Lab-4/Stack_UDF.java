import java.util.Scanner;
class Stack_Operation{
    int stack[] = new int[25];
    int top = -1;

    public void push(int x){
        if(top >= 25){
            System.out.println("Stack overFlow!");
        }
        else{
            top++;
            stack[top] = x;
        }
    }

    public int pop(){
        if(top <= -1){
            System.out.println("Stack UnderFlow...");
            return 0;
        }
        else{
            top--;
            return (stack[top+1]);
        }
    }

    public int peep(int i){
        if(top-i+1 <= -1 ){
            System.out.println("Invalid Index!");
            return 0;
        }
        else{
            return stack[top-i+1];
        }
    }

    public void change(int i, int x){
        if(top-i+1 <= -1 ){
            System.out.println("Invalid Index!");
        }
        else{
            stack[top-i+1] = x;
        }
    }

    public void display(){
        if(top<=-1){
            System.out.println("Stack UnderFlow!");
        }
        else{
            while(top != -1){
                System.out.println(stack[top]);
                top--;
            }
        }

    }
}
public class Stack_UDF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack_Operation st = new Stack_Operation();

        System.out.println("1 -> Push the element...");
        System.out.println("2 -> Pop The element...");
        System.out.println("3 -> Peep The element...");
        System.out.println("4 -> Change The element...");
        System.out.println("5 -> Display The element...");

        while(true){
            System.out.print("Enter the opration = ");

            switch(sc.nextInt()){
                case 1 :
                System.out.print("Enter the element, Which you need to push = ");
                st.push(sc.nextInt());
                break;

                case 2 :
                st.pop();
                System.out.println("Your top element remove successfully...");
                break;

                case 3 :
                System.out.print("Enter the Index, Which you can find = ");
                System.out.println(st.peep(sc.nextInt()));
                break;

                case 4 :
                System.out.print("Enter the Index, Which you want to change = ");
                int i = sc.nextInt();
                System.out.print("Enter the new Value = ");
                int x = sc.nextInt();
                st.change(i, x);
                break;

                case 5 :
                st.display();
                break;

                case 6 :
                System.exit(0);
            }
        }
    }
}













// import java.util.Scanner;
// class StackDemo{
// 	static int array[]=new int[100];
// 	static int top=-1;
// 	public static void push(int n){
// 		if(top>=100){
// 			System.out.println("Stack Overflow");
// 		}
// 		else{
// 			top++;
// 			array[top]=n;
// 		}
// 	}
// 	public static  int pop(){
// 		if(top<0){
// 			System.out.println("Stack Underflow");
// 			return 0;
// 		}
// 		else{
// 			int n = array[top];
// 			top--;
// 			return n;
// 		}
// 	}
// 	public static boolean find(int a,int m){
// 		if(a==m){
// 			return true;
// 		}
// 		else if(top>=0){
// 			a=pop();
// 			return find(a,m);
// 		}
// 		else{
// 			return false;
// 		}
// 	}
// }

// public class Find_Number_In_Array{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		StackDemo sd=new StackDemo();
// 		System.out.print("Enter size of array : ");
// 		int l=sc.nextInt();
// 		for(int i=0;i<l;i++){
// 			System.out.print("Enter array element : ");
// 			sd.push(sc.nextInt());
// 		}
// 		System.out.print("Enter no. you want to find : ");
// 		int m=sc.nextInt();
// 		int a=sd.pop();
// 		boolean flag=sd.find(a,m);
// 		if(flag){
// 			System.out.println("Number is found");
// 		}
// 		else
// 			System.out.println("Number is not found");
// 	}
// }