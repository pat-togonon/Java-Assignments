package day08_zodiacassignmentswitch;

import java.util.Scanner;

public class Day08_ZodiacAssignmentSwitch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int year;
        int chineseZodiac;
        String chineseSign = "";
        boolean isInvalid = false;
        
        System.out.print("Enter your birth year: ");
        year = scan.nextInt();
        chineseZodiac = year % 12; 
        
        switch (chineseZodiac) {
            case 0:
                chineseSign = "Monkey";
                break;
            case 1:
                chineseSign = "Rooster";
                break;
            case 2:
                chineseSign = "Dog";
                break;
            case 3:
                chineseSign = "Pig";
                break;
            case 4:
                chineseSign = "Rat";
                break;
            case 5:
                chineseSign = "Ox";
                break;
            case 6:
                chineseSign = "Tiger";
                break;
            case 7:
                chineseSign = "Rabbit";
                break;
            case 8:
                chineseSign = "Dragon";
                break;
            case 9:
                chineseSign = "Snake";
                break;
            case 10:
                chineseSign = "Horse";
                break;
            case 11:
                chineseSign = "Sheep";
                break;
            default:
                isInvalid = true;
                System.out.print("Please try again");
        }
        
        if (!isInvalid) {
            System.out.println("Your chinese zodiac sign is " + chineseSign + ".");
        }
    }
    
}
