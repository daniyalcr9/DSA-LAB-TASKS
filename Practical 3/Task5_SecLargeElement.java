import java.util.Arrays;
import java.util.Scanner;

public class Task5_SecLargeElement {
    public void Secondlargest(int array[],int Array_size){

        /* Checks if the Size of the Array is less than 2 */
        if(Array_size < 2) {
            System.out.printf("Invalid Size of the Array!!\n Program Terminated!");
            return;
        }
        Arrays.sort(array);  //Sorting the array..

        //Start from second last element
        //as the largest element is at last
        for (int i=Array_size - 2; i>=0; i--){
            // If the element is not
            // equal to largest element
            if (array[i] != array[Array_size - 1]){
                System.out.printf("\nThe Second Largest " + "Element in the Array is: %d\n", array[i]);
                System.out.println("Index = " + i);
                return;
            }// if
            else {
                System.out.println("No Second Largest Element found!");
                return;
            }// else

        }// for loop


    } // SecondLargest() ends here..

    public static void main(String[] args){



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array: ");
        int size = sc.nextInt();
        int array[] = new int[size]; // Array Initialized According to the User

        // for user input
        for(int i=0; i<array.length; i++){
            System.out.println("Enter the Element at Index (" + i + "): ");
            array[i] = sc.nextInt();
        }

        int length = array.length;

        // Creating a object..
        Task5_SecLargeElement t1 = new Task5_SecLargeElement();
        t1.Secondlargest(array, length); // Calling the Function.


    }
}
