/*
Kalena Abrahim
2/8/24
Triangle Area
*/

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

// =============== LAB SUMMARY ===============

/*
1. How much time was required to complete this assignment?
About 30 minutes was taken to complete this assignment.

2. What was the hardest part of this lab?
The hardest part of the lab was creating the final
print statement to output the area.

3. What will you always remember (never forget) from this exercise?
Properly formatting the equation for the final print statement.
*/
