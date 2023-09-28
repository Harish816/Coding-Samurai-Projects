import java.util.Scanner;
public class calculator {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        while (true) {
		            // Step 1: User Interface
		            System.out.println("\nJava Calculator");
		            System.out.println("Options:");
		            System.out.println("1. Addition");
		            System.out.println("2. Subtraction");
		            System.out.println("3. Multiplication");
		            System.out.println("4. Division");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice (1/2/3/4/5): ");
		            // Step 2: Input Handling
		            int choice = scanner.nextInt();
		            if (choice == 5) {
		                System.out.println("Exiting calculator. Goodbye!");
		                break;
		            }

		            // Step 3: Input Numbers
		            System.out.print("Enter the first number: ");
		            double num1 = scanner.nextDouble();
		            System.out.print("Enter the second number: ");
		            double num2 = scanner.nextDouble();

		            // Step 4: Arithmetic Operations
		            double result = 0.0;
		            String operation = "";

		            switch (choice) {
		                case 1:
		                    result = num1 + num2;
		                    operation = "Addition";
		                    break;
		                case 2:
		                    result = num1 - num2;
		                    operation = "Subtraction";
		                    break;
		                case 3:
		                    result = num1 * num2;
		                    operation = "Multiplication";
		                    break;
		                case 4:
		                    if (num2 == 0) {
		                        System.out.println("Error: Division by zero!");
		                        continue; // Go back to the menu
		                    }
		                    result = num1 / num2;
		                    operation = "Division";
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please select a valid option (1/2/3/4/5).");
		                    continue; // Go back to the menu
		            }
		 

		            // Step 5: Display Result
		            System.out.println(operation + " Result: " + result);
		        }

		        scanner.close();
		    }

	}