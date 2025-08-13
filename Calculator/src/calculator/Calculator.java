package calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int ans = 0;

        while (true) {
            // Take operator as input
            System.out.print("Enter operator (+, -, *, /, %, x to exit): ");
            char op = ip.next().trim().charAt(0);

            // Exit condition
            if (op == 'X' || op == 'x') {
                System.out.println("Calculator closed.");
                break;
            }

            // For valid operators, take two numbers
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter first number: ");
                int num1 = ip.nextInt();
                System.out.print("Enter second number: ");
                int num2 = ip.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }

                System.out.println("Result: " + ans);
            } else {
                System.out.println("Invalid operation");
            }
        }

        ip.close();
    }
}
