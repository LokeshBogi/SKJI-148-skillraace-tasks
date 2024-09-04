import java.util.Scanner;

public class CountDigitFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: The number as a string to easily check each digit
        String number = scanner.nextLine();
        scanner.close();
        
        // Initialize a counter for digit '4'
        int count = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < number.length(); i++) {
            // Check if the current character is '4'
            if (number.charAt(i) == '4') {
                count++;
            }
        }
        
        // Output the count of digit '4'
        System.out.println(count);
    }
}
