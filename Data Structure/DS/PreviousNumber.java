class PreviousNumber {
    public static void main(String[] args) {
        PreNumber pr1 = new PreNumber();
        PreNumber pr2 = new PreNumber(10,pr1);
        PreNumber pr3 = new PreNumber(10,pr2);
        PreNumber pr4 = new PreNumber(10,pr3);
        PreNumber pr5 = new PreNumber(10,pr4);
        PreNumber pr6 = new PreNumber(10,pr5);
        pr6.printDetails();
    }
    class PreNumber{
        int a;
        public PreNumber(){
            a = 5;
        }
        public PreNumber(int a, PreNumber prev){
            this.a = a;
            this.prev = prev;
        }
        public void printDetails(){
            if(prev != null){
                System.out.println("No 1 = "+prev.prev.prev.prev.prev.a+"\nNo 2 = "+prev.prev.prev.prev.a+"\nNo 3 = "+prev.prev.prev.a+"\nNo 4 = "+prev.prev.a+"\nNo 5 = "+prev.a+"\nNo 6 = "+a);
            }
        }
    }
}