import java.util.Scanner;

public class LogicArrayLoop {

    public static void main(String[] args) {

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Array with initial greeting components
        String[] arrays = {"Welcome ", " ", "!!"};

        // Prompt the user for their name
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Update the array to include the user's name in the second position
        arrays[1] = name;

        // Variable to hold the final greeting message
        String greeting = "";

        // Loop to concatenate all elements of the array to form the final greeting
        for (String element : arrays) {
            greeting += element; // Concatenate each element
        }

        // Display the final greeting message
        System.out.println(greeting);

        // Close the scanner
        scanner.close();
    }
}