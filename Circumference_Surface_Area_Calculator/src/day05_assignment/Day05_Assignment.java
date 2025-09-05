package day05_assignment;

import java.util.Scanner;

public class Day05_Assignment {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Radius: ");
        
        double radius = scan.nextInt();
        
        double circumference = 2 * Math.PI * radius;
                
        double sphereSurfaceArea = 4 * Math.PI * radius * radius;
               
        System.out.println("Circumference if circle: " + circumference);
        
        System.out.println("Surface area if sphere: " + sphereSurfaceArea);
        
    }
    
}
