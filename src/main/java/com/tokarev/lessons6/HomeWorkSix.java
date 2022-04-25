package com.tokarev.lessons6;

import java.util.Scanner;

public class HomeWorkSix {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Welcome to the travel agency! How can I call you?");
        Scanner scanner = new Scanner(System.in);
        String userData = scanner.next();
        String directionOfTravelOne = "Egypt";
        String directionOfTravelTwo = "Berlin";
        String directionOfTravelThree = "Paris";
        String directionOfTravelFour = "London";
        String direction = "";
        String i = "$";
        int fullFlightCost = 0;
        int costOneTicket = 0;
        int ticketPriceToEgypt = 350;
        int ticketPriceToBerlin = 200;
        int ticketPriceToParis = 280;
        int ticketPriceToLondon = 400;

        printGreeting(userData);
        System.out.println("Available destinations now : " + directionOfTravelOne + ", " + directionOfTravelTwo + ", " + directionOfTravelThree + ", " + directionOfTravelFour);
        Scanner scanner1 = new Scanner(System.in);
        userData = scanner1.next();
        switch (userData) {
            case "Egypt":
                costOneTicket = ticketPriceToEgypt;
                direction = directionOfTravelOne;
                break;
            case "Berlin":
                costOneTicket = ticketPriceToBerlin;
                direction = directionOfTravelTwo;
                break;
            case "Paris":
                costOneTicket = ticketPriceToParis;
                direction = directionOfTravelThree;
                break;
            case "London":
                costOneTicket = ticketPriceToLondon;
                direction = directionOfTravelFour;
                break;
            default:
                System.out.println("You entered an invalid value, please try again");
                System.exit(0);
        }

        System.out.println("Ok. Please, enter the number of passengers");
        Scanner scanner2 = new Scanner(System.in);
        int numberOfTravelers = scanner2.nextInt();
        if (numberOfTravelers <= 0) {
            System.out.println("You entered an invalid number, please try again");
            System.exit(0);
        }

        System.out.println("Ok. Please enter the account from which the payment will be made");
        Scanner scanner3 = new Scanner(System.in);
        int customerAccount = scanner3.nextInt();

        int numberOfAvailableTicketsInFirstBoxOffice = 50;
        int numberOfAvailableTicketsInSecondBoxOffice = 47;
        int numberOfAvailableTicketsInThirdsBoxOffice = 40;

        System.out.println("Cost of one ticket = " + costOneTicket + i);
        System.out.println("Number of travelers = " + numberOfTravelers);
        System.out.println("Direction of travel = " + direction);

        fullFlightCost = calculationFullFlightCost(costOneTicket, numberOfTravelers);
        System.out.println("Total cost of the flight = " + fullFlightCost + i);
        int additionalExpenses = 500;
        int totalCostAdditionalExpenses = 0;
        totalCostAdditionalExpenses = calculationAdditionalCosts(numberOfTravelers, additionalExpenses);
        System.out.println("Total cost additional expenses = " + totalCostAdditionalExpenses + i);
        int totalTravelCost = 0;
        totalTravelCost = calculationTotalTravelCost(fullFlightCost, totalCostAdditionalExpenses);
        System.out.println("Total travel cost = " + totalTravelCost + i);

        int differenceOne = numberOfAvailableTicketsInFirstBoxOffice - numberOfTravelers;
        int checkingOne = checkingAvailableTickets(numberOfAvailableTicketsInFirstBoxOffice, numberOfTravelers);

        int differenceTwo = numberOfAvailableTicketsInSecondBoxOffice - numberOfTravelers;
        int checkingTwo = checkingAvailableTickets(numberOfAvailableTicketsInSecondBoxOffice, numberOfTravelers);

        int differenceThree = numberOfAvailableTicketsInThirdsBoxOffice - numberOfTravelers;
        int checkingThree = checkingAvailableTickets(numberOfAvailableTicketsInThirdsBoxOffice, numberOfTravelers);

        outputNumberOfTickets(checkingOne, differenceOne);
        outputNumberOfTickets(checkingTwo, differenceTwo);
        outputNumberOfTickets(checkingThree, differenceThree);

        int agencyAccount = 0;

        moneyTransaction(customerAccount, agencyAccount, costOneTicket, numberOfAvailableTicketsInSecondBoxOffice);
    }


    public static void printGreeting(String userData) {
        System.out.println("Fine! " + userData + ", Where would you like to fly?");
        System.out.println("------------------------------------------------------------------------------");
    }

    public static int calculationFullFlightCost(int costOneTicket, int numberOfTravelers) {
        return costOneTicket * numberOfTravelers;
    }

    public static int calculationAdditionalCosts(int numberOfTravelers, int additionalExpenses) {
        return additionalExpenses * numberOfTravelers;

    }

    public static int calculationTotalTravelCost(int fullFlightCost, int totalCostAdditionalExpenses) {
        return fullFlightCost + totalCostAdditionalExpenses;
    }

    public static int checkingAvailableTickets(int numberOfAvailableTickets, int numberOfTravelers) {
        if (numberOfTravelers < numberOfAvailableTickets) {
            return 1;
        } else if (numberOfTravelers == numberOfAvailableTickets) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void outputNumberOfTickets(int checkingTickets, int difference) {
        if (checkingTickets == 1) {
            System.out.println("Enough tickets for more passengers");
            System.out.println("Remaining tickets = " + difference);
        } else if (checkingTickets == 0) {
            System.out.println("Enough tickets for all passengers");
            System.out.println("Remaining tickets = " + difference);
        } else {
            if (difference < 0) {
                difference = difference * (-1);
            }
            System.out.println("There are not enough tickets for all passengers");
            System.out.println("Not enough tickets = " + difference);
        }
    }

    public static void moneyTransaction(int customerAccount, int agencyAccount, int costOneTicket, int numberOfTickets) {
        for(int i = 1; i < numberOfTickets; i++){
            customerAccount -= costOneTicket;
            agencyAccount += costOneTicket;
            System.out.println();
            System.out.println("Ticket successfully purchased! Number of tickets : " + i + ". Balance of your account : " + customerAccount + "$");
            if(customerAccount < costOneTicket) {
                System.out.print("Oh no! :( Not enough money to buy a ticket!");
                break;

              }
          }
      }
}

