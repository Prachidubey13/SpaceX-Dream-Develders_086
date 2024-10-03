import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {

    // Method to reverse the string using a stack
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        // Push each character of the string onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop each character from the stack to reverse the string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        // Prompt user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call method to reverse the string and display the result
        String reversedString = reverseString(input);
        System.out.println("The reversed string is: " + reversedString);
    }
}

