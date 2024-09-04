import java.util.Scanner;

public class RideEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: The age of the person
        int age = scanner.nextInt();
        scanner.close();
        
        // Check the age and print the appropriate message
        if (age < 15 || age > 60) {
            System.out.println("Not Allowed");
        } else {
            System.out.println("Allowed");
        }
    }
}
