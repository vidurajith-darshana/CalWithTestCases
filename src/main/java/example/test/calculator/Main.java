package example.test.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");

        num1 = scanner.nextDouble();

        System.out.println("Enter first number : ");

        num2 = scanner.nextDouble();

        System.out.println("Enter operator : ");

        char oper = scanner.next().charAt(0);

        scanner.close();

        double result;

        Calculator calculator = new Calculator();

        switch (oper) {
            case '+':
                calculator.addition(num1, num2);
                break;
            case '-':
                calculator.substract(num1, num2);
                break;

            case '*':
                calculator.multiply(num1, num2);
                break;

            case '/':
                calculator.devide(num1, num2);
                break;

            case '!':
                calculator.findFactorial(num1);

            default:
                System.out.printf("You have entered wrong operator");
                return;

        }

    }
}
