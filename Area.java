import java.util.Scanner;

public class Area {
    private double length, breadth;

    // Method to set dimensions
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return area
    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area rectangle = new Area();

        // Taking user input
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();
        
        // Setting dimensions and printing area
        rectangle.setDim(length, breadth);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        
        scanner.close();
    }
}
