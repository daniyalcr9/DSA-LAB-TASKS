import java.util.Scanner;

public class Area {
    float length;
    float breadth;

    // Constructor Area
    public Area(float length, float breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    // returnArea Method
    public float returnArea() {

        float area = length*breadth;
        return area;
    }

    // Main Method
    public static void main(String[] args) {

        float a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length of the Rectangle: ");
        a = sc.nextFloat();
        System.out.println("Enter the Breadth of the Rectangle: ");
        b = sc.nextFloat();


        Area Rectangle = new Area(a,b);
        System.out.println("The Area of the Rectangle via Constructor is: " + Rectangle.returnArea());
    }
}
