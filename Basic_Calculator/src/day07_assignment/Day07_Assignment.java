package day07_assignment;

import java.util.Scanner;

public class Day07_Assignment {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double answer = 0.0;
        
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        scan.nextLine(); //compensating for nextInt
        
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        scan.nextLine(); //compensating for nextInt
        
        System.out.print("Enter the operation symbol: ");
        String operationSymbol = scan.nextLine();
        
        switch(operationSymbol.trim()) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Can't divide a number by zero.");
                    break;
                }
                answer = (1.0 * num1) / num2; // converting int to a double before division 
                                                //for a more accurate answer
                break;
            default:
                System.out.println("Invalid operation.");
                
        }
        
        // Printing out the answer except for the edge cases
        if (!(num2 == 0 && operationSymbol.equals("/")) && operationSymbol.matches("[-+*/]")) {
            System.out.println(num1 + " " + operationSymbol + " " + num2 + " = " + answer);
        }
    }
    
}
