package studentgrades;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;

public class StudentGrades {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       ArrayList<Double> averageGradesPerSubject = new ArrayList<>();
       int PASSING_GRADE = 75;
       int failedCounter = 0;
       int passedCounter = 0;
       int sum = 0;     
       double averageGrade = 0.0;
       double avgSum = 0.0;
       
       // 5 subjects, 3 exam grades - prelim, midterm, finals
       String[][] grades = {
           { "Math" , "82", "77", "85" },
           { "Chemistry", "78", "71", "80" },
           { "PE", "95", "93", "97" },
           { "Arts", "72", "79", "81" },
           { "English", "83", "77", "82" },
       };

       
       for (int row = 0; row < grades.length; row++) {
           for (int col = 1; col < grades[row].length; col++) {
               int grade = Integer.valueOf(grades[row][col]);
               
               if (grade < PASSING_GRADE) {
                   failedCounter++;
               } else {
                   passedCounter++;
               }
               
               sum += grade;            
           }
           
           averageGrade = 1.0 * sum / (failedCounter + passedCounter);
           averageGradesPerSubject.add(averageGrade);
           String formattedAvg = String.format("%.2f", averageGrade);
           
           System.out.println(grades[row][0]);
           System.out.println("You have " + passedCounter + " passed exams and " 
                   + failedCounter + " failed exams in " + grades[row][0] + ".");
           System.out.println("Average Grade: " + formattedAvg);
           System.out.println();
           
           // reset for the next subject
           sum = 0;
           failedCounter = 0;
           passedCounter = 0;
           averageGrade = 0.0;
       }
       
       for (double avg : averageGradesPerSubject) {
           avgSum += avg;
       }
       
       System.out.println("----- REPORT ------");
       averageGrade = avgSum / (averageGradesPerSubject.size());
       
       String formattedGenAvg = String.format("%.2f", averageGrade);
       
       if (averageGrade < PASSING_GRADE) {
           System.out.println("Sorry, you'll have to redo the entire year.");
           System.out.println("Your general average: " + formattedGenAvg);
       } else {
           System.out.println("Congrats! You passed this academic year!");
           System.out.println("Your general average: " + formattedGenAvg);
       }
       
               
       
    }
    
}
