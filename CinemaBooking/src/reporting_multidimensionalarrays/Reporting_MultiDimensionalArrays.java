package reporting_multidimensionalarrays;

import java.util.Scanner;

public class Reporting_MultiDimensionalArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int MAX_CAP_PER_ROW = 30;
        double MOVIE_TICKET_PRICE = 600.0; //pesos
        double totalSales = 0.0;
        int totalBooking = 0;
        int totalAvailableSeats = 0;
        int paxToBook = 0;
        boolean isTogether = false;
        
        // Row number | Reserved Seats | Available Seats
        int[][] cinemaSeats = {
            { 5, MAX_CAP_PER_ROW - 15, 15},
            { 2, MAX_CAP_PER_ROW - 13, 13},
            { 3, MAX_CAP_PER_ROW - 7, 7},
            { 1, MAX_CAP_PER_ROW - 25, 25},
            { 4, MAX_CAP_PER_ROW - 10, 10},
        };
        
        // TOTAL SALE/GROSS EARNING
        // % Booking Rate
        
        for (int row = 0; row < cinemaSeats.length; row++) {
            totalSales += (cinemaSeats[row][1] * MOVIE_TICKET_PRICE);
            totalBooking += cinemaSeats[row][1];      
            totalAvailableSeats += cinemaSeats[row][2];
        }
        
        double bookingRate = totalBooking * 100.0 / (MAX_CAP_PER_ROW * cinemaSeats.length);
        int totalCinemaCapacity = cinemaSeats.length * MAX_CAP_PER_ROW;
        
        String formattedAmount = String.format("%,.2f", totalSales);
        String formattedBookingRate = String.format("%.2f", bookingRate);
        
        System.out.println("----- STATUS -----");
        System.out.println("Total amount earned: Php " + formattedAmount);
        System.out.println("Booking: " + totalBooking + " seats booked out of " 
                + totalCinemaCapacity + " total seats or "+ formattedBookingRate 
                + "% booking rate.");
        
        System.out.println("\n----- SEAT RESERVATION INQUIRY -----");
        System.out.println("How many person to book? ");
        paxToBook = scan.nextInt();
        scan.nextLine();
        System.out.println("Do you want to seat together or any seat is okay? "
                + "(Y if together/N if any)");
        String answer = scan.nextLine();
        
        if (answer.equals("Y")) {
            isTogether = true;
        }      
        
        boolean isAvailable = false;
        int availableRow = -1;
        
        for (int row = 0; row < cinemaSeats.length; row++) {
            if (cinemaSeats[row][2] >= paxToBook) {
                isAvailable = true;
                availableRow = cinemaSeats[row][0];
                break;
            }
        }
        
        if (isTogether && isAvailable) {
            System.out.println("Yes, we have available seats for " 
                    + paxToBook + " people on row " + availableRow + ".");
        } else if (isTogether == true && paxToBook > MAX_CAP_PER_ROW) {
            System.out.println("Sorry, we only have a maximum of " 
                    + MAX_CAP_PER_ROW + " seats available per row.");
        } else if (isTogether && !isAvailable) {
            System.out.println("Sorry, we don't have " + paxToBook 
                    + " seats available in the same row.");
        } else if (isTogether == false && totalAvailableSeats >= paxToBook) {
            System.out.println("Yes, we have available seats for " 
                    + paxToBook + " people but seats are in multiple, different rows.");
        } 
        
        
        
    }
    
}
