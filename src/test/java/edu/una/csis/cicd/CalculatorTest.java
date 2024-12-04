package edu.una.csis.cicd;

import java.util.Scanner;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose an operation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        
        int choice = scanner.nextInt();

        int result = 0;
        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                break;
            
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Result: " + result);
    }
}
