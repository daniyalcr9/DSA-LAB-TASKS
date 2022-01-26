import java.util.Scanner;

public class Task1_Array {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int row;
        int column;

        System.out.println("Enter the Number of Rows: ");
        row = sc.nextInt();
        System.out.println("Enter the Number of Columns: ");
        column = sc.nextInt();

        // Initializing 2d Array According to User.
        int [][] arr = new int[row][column];

        /* For Getting User Input */
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){

                System.out.println("Enter the value at Index" + "("+ i+""+j+"" + ")");
                arr[i][j] = sc.nextInt();
            }// Inner
        }// Outer


        System.out.print("Entered Matrix: \n");
        /* For Printing the 2d Matrix */
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){

                System.out.print(arr[i][j] + " ");
            }// Inner

            System.out.println();
        }// Outer

    }
}
