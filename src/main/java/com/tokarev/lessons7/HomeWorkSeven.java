package com.tokarev.lessons7;

import java.util.Scanner;

public class HomeWorkSeven {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("Welcome to the travel agency! How can I call you?");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        String userData = scanner.next();
        String[] destinations = {"Egypt, ", "Paris, ", "Berlin, ", "London, ", "Rome, ", "Kiev, ", "Washington, ", "New-York, ", "Vilnius, ", "Tokyo,"};
        int[] ticketPrice = {350, 280, 200, 400, 190, 120, 430, 505, 240, 340};
        String directionOfTravelOne = "Egypt";
        String directionOfTravelTwo = "Berlin";
        String directionOfTravelThree = "Paris";
        String directionOfTravelFour = "London";
        String direction = "";
        String i = "$";
        int fullFlightCost = 0;
        int costOneTicket = 0;
        int customerAccount = 0;
        int ticketPriceToEgypt = 350;
        int ticketPriceToBerlin = 200;
        int ticketPriceToParis = 280;
        int ticketPriceToLondon = 400;

        printGreeting(userData);
        System.out.println("Available destinations now : ");
        for (int b = 0; b < destinations.length; b++) {
            System.out.print(destinations[b]);
        }
        System.out.println("");

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
                System.out.println("Input correct data");
                System.exit(0);
        }

        int numberOfTravelers = 0;
        System.out.println("Ok. Please, enter the number of passengers");
        Scanner scanner2 = new Scanner(System.in);
        while (true) {
            numberOfTravelers = scanner2.nextInt();
            if (numberOfTravelers > 0) {
                break;
            }
            System.out.println("You entered an invalid number, please try again");
        }

        System.out.println("Ok. Please enter the account from which the payment will be made");
        Scanner scanner3 = new Scanner(System.in);
        while (true) {

            customerAccount = scanner3.nextInt();
            if (customerAccount > 0) {
                break;
            }
            System.out.println("There are no funds on the next account, please try again");
        }

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

        getUserIntData(scanner2);
        getUserIntDataTwo(scanner3);
        printDestinations(destinations);
        printTicketPrices(ticketPrice);
        reverseOrder(destinations);
        reserveOrderPrices(ticketPrice);
        printDestinationsAndPrices(destinations, ticketPrice);
        moneyTransaction(customerAccount, agencyAccount, costOneTicket, numberOfAvailableTicketsInSecondBoxOffice, numberOfTravelers);
        scanner.close();
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

    public static void moneyTransaction(int customerAccount, int agencyAccount, int costOneTicket, int numberOfTickets, int travelers) {
        for (int i = 1; i < numberOfTickets; i++) {
            if (customerAccount < costOneTicket) {
                System.out.println("Oh no! :( Not enough money to buy a ticket!");
                break;

            }
            if (travelers <= 0) {
                System.out.println("You have bought all tickets for the given number of people");
                System.exit(0);
            }
            customerAccount -= costOneTicket;
            agencyAccount += costOneTicket;
            travelers -= 1;
            System.out.println();
            System.out.println("Ticket successfully purchased! Number of tickets : " + i + ". Balance of your account : " + customerAccount + "$");
        }
    }

    public static void printDestinations(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println(" ");
    }

    public static void printTicketPrices(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static void reverseOrder(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void reserveOrderPrices(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void printDestinationsAndPrices(String[] array, int[] arrayOne) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" Destinations " + array[i]);
            System.out.print(" Prices " + arrayOne[i]);
            System.out.println("");
        }
    }

    public static int getUserIntData(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }

    public static int getUserIntDataTwo(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }
}


