
import java.io.*;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "student_info.dat";

       
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (cm): ");
        double height = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeDouble(weight);
            dos.writeDouble(height);
            dos.writeUTF(city);
            dos.writeUTF(phone);
            System.out.println("\nData successfully written to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            return;
        }

      
        System.out.println("\nRetrieving data from " + filename + ":");
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            String rName = dis.readUTF();
            int rAge = dis.readInt();
            double rWeight = dis.readDouble();
            double rHeight = dis.readDouble();
            String rCity = dis.readUTF();
            String rPhone = dis.readUTF();

            System.out.println("Name   : " + rName);
            System.out.println("Age    : " + rAge);
            System.out.println("Weight : " + rWeight + " kg");
            System.out.println("Height : " + rHeight + " cm");
            System.out.println("City   : " + rCity);
            System.out.println("Phone  : " + rPhone);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        scanner.close();
    }
}
