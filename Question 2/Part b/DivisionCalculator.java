// Import Scanner for user input
import java.util.Scanner; 

public class DivisionCalculator {
    public static void main(String[] args) {

        //Scanner object
        Scanner scanner = new Scanner(System.in); 

        try {
            //user input
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Perform division
            // If num2 is 0 there will be an ArithmeticException 
            int result = num1 / num2;  

            // Display result if no error occurs
            System.out.println("Result: " + result);
        
        // Catch if division is by 0
        } catch (ArithmeticException e) {  
            System.out.println("Cannot divide by zero!");

        // Catch any other unexpected errors
        } catch (Exception e) {  
            System.out.println("Invalid input! Please enter numbers only.");
        
        // Close the scanner
        } finally {
            scanner.close();  
        }
    }
}

