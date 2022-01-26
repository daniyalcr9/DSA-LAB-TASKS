import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in); // take input use scanner method
        System.out.println("Input the Given number");
        num = sc.nextInt();
        for(int n=5 ; n<=10 ; n++){
            System.out.println(num + "*" + n + "=" + num*n);

        }

    }}
