import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        findArea();
    }

    // This method prompts the user for geometric-numbers from the user and
    // displays the area of a triangle.
    public static void findArea() {
        // Instantiate a Scanner to take input from the user.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the triangle height and store the input in a
        // variable named 'height'.
        System.out.print("Enter the height:\n");
        int height = scanner.nextInt();

        // Prompt the user for the triangle height and store the input in a
        // variable named 'base'.
        System.out.print("Enter the base:\n");
        int base = scanner.nextInt();

        // Display the area of the triangle.
        System.out.println("\nThe area of the triangle is " +
            ((height * base * 5) / 10) + "." + ((height * base * 5) % 10) + ".");
    }
}
