package surfacearea_volume_calculator;

import java.util.Scanner;

public class SurfaceArea_Volume_Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("==========Calculator for Rectangular Prisms==========");
        
        System.out.println(9+(3*8)/4);
        int i = 10;
        int n = i++%5;
        System.out.println(i);
        while (true) {
            System.out.println("Enter Length: ");
            String length = scan.nextLine();
            if (!isValidInput(length)) {
                System.out.println("Length is not a number. Please try again.");
                continue;
            }
            
            System.out.println("Enter Width: ");
            String width = scan.nextLine();
            if (!isValidInput(width)) {
                System.out.println("Width is not a number. Please try again.");
                continue;
            }
            
            System.out.println("Enter Height: ");
            String height = scan.nextLine();
            if (!isValidInput(height)) {
                System.out.println("Height is not a number. Please try again.");
                continue;
            }
            
            System.out.println("Choose what to compute:");
            System.out.println("1 - Volume");
            System.out.println("2 - Surface Area");
            String option = scan.nextLine().trim();
            
            if (option.equals("1")) {
                System.out.println("The volume of your rectangular prism is " + computeVolume(getDouble(length), getDouble(width), getDouble(height)));
                break;
            } else if (option.equals("2")) {
                System.out.println("The surface area of your rectangular prism is " + computeSurfaceArea(getDouble(length), getDouble(width), getDouble(height)));
                break;
            } else {
                System.out.println("Not on list.");
                break;
            }
        }
    }
    
    public static boolean isValidInput(String input) {
        if (input.matches("\\d+")) {
            return true;            
        }
        
        return false;
    }
    
    public static double computeVolume(Double l, Double w, Double h) {
        return l * w * h;
    }
    
    public static double computeSurfaceArea(Double l, Double w, Double h) {        
        return 2 * ((w * l) + (h * l) + (h * w));
    }
    
    public static double getDouble(String input) {
        return Double.valueOf(input);
    }
}
