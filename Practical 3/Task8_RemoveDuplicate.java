import java.util.Arrays;
import java.util.Scanner;
public class Task8_RemoveDuplicate {
    public int removeDuplicateElements(int array[], int array_length){
        // Checking if the ArraySize is less than or equal to 1
        if (array_length==0 || array_length==1){
            System.out.println("Invalid Array Size!");
        }
        int[] tempArr = new int[array_length];  // Creating a temporary Array
        int k = 0; // for index

        /* for loop to compare every element in the array with its next element. */
        for (int i=0; i<array_length-1; i++){

            if (array[i] != array[i+1]){
                tempArr[k++] = array[i];
            }
        }
        tempArr[k++] = array[array_length-1];

        /* Shifting all the unique elements in the array[] from temp[] array. */
        for (int i=0; i<k; i++){

            array[i] = tempArr[i];
        }
        return k; /* returns the index or size of the array */

    }
    public static void main (String[] args) {
        Task8_RemoveDuplicate t =  new Task8_RemoveDuplicate();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int size = sc.nextInt();
        int array[] = new int[size]; // Array initialized according to the user
        // for user input
        for(int i=0; i<array.length; i++){
            System.out.println("Enter the value at Index (" + i + "): ");
            array[i] = sc.nextInt();
        }
        /* Sorting the array using Arrays.sort Method. */
        Arrays.sort(array);

        int length = array.length;
        length = t.removeDuplicateElements(array, length);

        System.out.print("\nNew Array: ");
        // for printing the new Array.
        for(int i=0; i<length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("\nNew Length: " + length);


    }
}
