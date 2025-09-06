package title_formatter;

import java.util.Scanner;

public class Title_Formatter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;
        String[] userInputAsArray;
        
        System.out.println("Enter a sentence: ");
        userInput = scan.nextLine();
        
        userInputAsArray = userInput.trim().split(" ");
        
        StringBuilder formattedSentence = new StringBuilder();
        
        for (String str : userInputAsArray) {
            // If the sentence doesn't start with a letter:
            if (!str.substring(0, 1).matches("[a-zA-Z]")) {
                str = str.substring(0, 1) + str.substring(1, 2).toUpperCase() + str.substring(2).toLowerCase() + " ";     
            } else {
                str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase() + " ";
            }
            
            formattedSentence.append(str);
        }
        
        System.out.println("\n--Result--");
        System.out.println("After Capitalizing Each Word:");
        System.out.println("\n" + formattedSentence);
    }
    
}
