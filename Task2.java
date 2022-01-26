// Name : Daniyal Awan
// Subject : DSA
// PRACTICAL NUMBER 1
//... TASK NUMBER 1 ...
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Units consumed : ");
        int unit = sc.nextInt();
        if( unit < 50 && unit >0 ){
        int bill = unit * 10;
        System.out.println("Your Electricity Bill is " + bill + " Rupees");
        }
        else if( unit >= 50 && unit <= 100 ){
            int bill = unit * 15;
            System.out.println("Your Electricity Bill is " + bill + " Rupees");
        }
        else if( unit >= 101 && unit <= 200 ){
            int bill = unit * 20;
            System.out.println("Your Electricity Bill is " + bill + " Rupees");
        }
        else if( unit >= 201 && unit <= 300 ){
            int bill = unit * 25;
            System.out.println("Your Electricity Bill is " + bill + " Rupees");
        }
        else if( unit >= 301 ){
            int bill = unit * 30;
            System.out.println("Your Electricity Bill is " + bill + " Rupees");
        }
        else {
            System.out.println("Please enter a valid Input...");
        }
    }
}
