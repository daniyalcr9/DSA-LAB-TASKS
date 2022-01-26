import java.util.Scanner;

public class Area1 {
    float length;
    float breadth;

    // setDimension Method
    public void setDimension(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;

    }
    // getArea Method
    public float getArea() {

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

        Area1 Rectangle = new Area1();
        Rectangle.setDimension(a,b);
        System.out.println("The Area of the Rectangle is: " + Rectangle.getArea());
    }

}
