import java.util.Scanner;

public class Task_2_ArrayEqual {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array 1: ");
        int size1 = sc.nextInt();
        System.out.println("Enter the Size of Array 2: ");
        int size2 = sc.nextInt();

        int a[] = new int[size1];  // Initializing array size according to the user.
        int b[] = new int[size2];

        System.out.println("\n------[ Array 1 ]------");
        for(int i=0; i<a.length; i++) {
            System.out.println("Enter the value of Element at Index(" + i + ")");
            a[i] = sc.nextInt();
        }

        System.out.println("\n------[ Array 2 ]------");
        for(int j=0; j<b.length; j++) {
            System.out.println("Enter the value of Element at Index(" + j + ")");
            b[j] = sc.nextInt();
        }

        boolean result = true; // initializing boolean result with true
        if (a.length == b.length) { // Comparing the ArraySize.

            for (int i = 0; i < a.length; i = i + 1) {

                if (a[i] != b[i]) {
                    result = false;
                }
            }// for
        }// if
        else {
            result = false;
        }// else

        // Checking the result variable whether it is true or false.
        if (result == true) {
            System.out.println("\nBoth Arrays are Equal to Eachother!");
        }
        else {
            System.out.println("\nBoth Arrays are Not Equal to Eachother!");
        }
}}
