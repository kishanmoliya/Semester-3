class fact{
        public int factorial(int n){;
        if(n == 0){
            return 0;
        }
        else{
            return (factorial(n/10)) + 1;
        }
    }
}

public class Recuriconn {
    public static void main(String[] args) {
        fact f = new fact();
        
        System.out.println(f.factorial(455));
    }
}
