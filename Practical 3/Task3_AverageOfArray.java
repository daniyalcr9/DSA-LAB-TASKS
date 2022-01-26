import java.util.Scanner;
public class Task3_AverageOfArray {
    public float Average() {
        // Initializing sum with value 0, it will store the sum of the Array.
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int size = sc.nextInt();
        // Array initialized according to the User
        int array[] = new int[size];
        // For User Input
        for(int i=0; i<array.length; i++) {
            System.out.println("Enter the Value at Index (" + i + ")" );
            array[i] = sc.nextInt(); }
        // For Sum
        for(int j=0; j<array.length; j++) {
            sum = sum + array[j];
        }
        System.out.println("Total Sum of the Array: " + sum);
        // Formula to Calculate the Average.
        float Average = sum/size;
        return Average;
    }
    public static void main(String[] args) {
        Task3_AverageOfArray a = new Task3_AverageOfArray();
        System.out.println("The Average of the Array is: " + a.Average());
    }
}
