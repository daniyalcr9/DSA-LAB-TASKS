public class Task4 {
    public static void main(String[] args) {
        int n1=0 , n2=1, n3;
        System.out.println("Fibonacci Series");
        System.out.print(n1 +" "+ n2+"");
        for(int i=0 ; i<10 ; i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
    }
}
