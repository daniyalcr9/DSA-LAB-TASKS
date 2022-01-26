import java.util.Arrays;
import java.util.Scanner;

public class Task6_ArraySorting {
    /* function to sort the Matrix */
    public void sortMatrix(int matrix[][], int s){

        int temp[] = new int[s*s]; // Creating a Temporary Matrix
        int c = 0;

        // For Copying the Values of Entered Matrix into Temporary Matrix...
        for (int i=0; i<s; i++) {
            for (int j=0; j<s; j++) {
                temp[c++] = matrix[i][j];
            }
        }
        /* Using Array.sort() method to sort the Temp Array */
        Arrays.sort(temp);

        c = 0;
        for (int i=0; i<s; i++) {
            for (int j=0; j<s; j++) {
                matrix[i][j] = temp[c++];
            }
        }
    }// sortMatrix() Ends here..

    /* printMatrix() to print the Matrix */
    public void printMatrix(int matrix[][], int n){

        for(int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }// printMatrix() ends here...
    public static void main(String args[]){
        Task6_ArraySorting t1 = new Task6_ArraySorting();
        Scanner sc = new Scanner(System.in);
        int rows,columns;
        System.out.println("Enter the Number of Rows: ");
        rows = sc.nextInt();

        System.out.println("Enter the Number of Columns: ");
        columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];
        // for user input
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++){
                System.out.println("Enter the Value at Index (" + i + j + "): ");
                matrix[i][j] = sc.nextInt();
            } }
        int Array_length = matrix.length;

        // Printing the Original Entered Array....
        System.out.println("\nOriginal Entered Matrix:");
        t1.printMatrix(matrix, Array_length);
        // Sorting the Array by calling the SortMatrix() function..
        t1.sortMatrix(matrix, Array_length);
        // Printing the Sorted Array...
        System.out.println("Matrix After Sorting:");
        t1.printMatrix(matrix, Array_length);

    }
}
