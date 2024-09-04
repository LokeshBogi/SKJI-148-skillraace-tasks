import java.util.Scanner;

public class SumOddEvenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: The number as a string to handle very large numbers
        String number = scanner.nextLine();
        scanner.close();
        
        // Initialize sums for odd and even digits
        int sumOdd = 0;
        int sumEven = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < number.length(); i++) {
            // Convert the character to an integer (digit)
            int digit = Character.getNumericValue(number.charAt(i));
            
            // Check if the digit is even or odd and add to respective sum
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
        }
        
        // Output the results: sum of odd digits and sum of even digits
        System.out.println(sumOdd + " " + sumEven);
    }
}
