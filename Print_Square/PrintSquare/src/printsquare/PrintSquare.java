package printsquare;

import java.util.Scanner;
public class PrintSquare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int squareSize;
        char ch1 = 'p';
        
        System.out.print("Enter square size: ");
        squareSize = scan.nextInt();
        System.out.println("\nPrintout:");
        
        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                if (i == 0 || i == squareSize - 1 || j == 0 || j == squareSize - 1) {
                    System.out.print(ch1 + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
    
}
