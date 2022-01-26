import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows of Matrix 1: ");
        int rows1 = sc.nextInt();
        System.out.println("Enter the Number of Columns of Matrix 1: ");
        int columns1 = sc.nextInt();

        int array1[][] = new int [rows1][columns1]; // Initializing Array 1

        // For getting the User input
        for(int i=0; i<array1.length; i++) {
            for(int j=0; j<array1.length; j++) {
                System.out.println("Enter the Value at Index (" + i+j + ")");
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the Number of Rows of Matrix 2: ");
        int rows2 = sc.nextInt();
        System.out.println("Enter the Number of Columns of Matrix 2: ");
        int columns2 = sc.nextInt();

        // This if checks if the ( Columns of Matrix1 = Rows of Matrix2 )....
        if(columns1==rows2) {
            int array2[][] = new int [rows2][columns2]; // Initializing Array 2

            // For getting the User input
            for(int i=0; i<array2.length; i++) {
                for(int j=0; j<array2.length; j++) {
                    System.out.println("Enter the Value at Index (" + i+j + ")");
                    array2[i][j] = sc.nextInt();
                }
            }

            /*  Initializing result[][] with the Size using a Condition  */
            int result[][] = new int[rows1][columns2];

            // Traversing the Product of both Arrays and Storing the result in result[][].
            for(int i=0; i<array2.length; i++) {
                for(int j=0; j<array2.length; j++) {
                    result[i][j] = array1[i][j] * array2[i][j];
                }
            }

            System.out.println("\nResult Matrix/Product: ");
            // for printing the result[][] array.
            for(int i=0; i<array2.length; i++) {
                for(int j=0; j<array2.length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

        }// if
        else {
            System.out.println("Multiplication is not Possible!\nReason = No of Rows1 != Columns2");
        }// else



    }
}
