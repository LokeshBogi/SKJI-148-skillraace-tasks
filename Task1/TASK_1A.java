import java.util.Scanner;

public class FunFairChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: The change to be given to Pranav
        int N = scanner.nextInt();
        scanner.close();
        
        // Available denominations in descending order
        int[] denominations = {100, 50, 10, 5, 2, 1};
        int count = 0;
        
        // Loop through each denomination
        for (int denom : denominations) {
            if (N >= denom) {
                count += N / denom;  // Add the number of notes of this denomination
                N = N % denom;        // Update the remaining amount of money
            }
        }
        
        // Output the minimum number of notes required
        System.out.println(count);
    }
}
