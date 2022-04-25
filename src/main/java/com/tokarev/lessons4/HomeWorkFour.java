package com.tokarev.lessons4;

public class HomeWorkFour {

    public static void main(String[] args) {
        int fullFlightCost = 0;
        int costOneTicket = 400;
        int numberOfTravelers = 47;
        int numberOfAvailableTicketsInFirstBoxOffice = 50;
        int numberOfAvailableTicketsInSecondBoxOffice = 47;
        int numberOfAvailableTicketsInThirdsBoxOffice = 40;

        String directionOfTravel = "Egypt";
        greeting();
        System.out.println("Cost of one ticket = " + costOneTicket + "$");
        System.out.println("Number of travelers = " + numberOfTravelers);
        System.out.println("Direction of travel = " + directionOfTravel);
        fullFlightCost = calculationFullFlightCost(costOneTicket, numberOfTravelers);
        System.out.println("Total cost of the flight = " + fullFlightCost + "$");
        int additionalExpenses = 500;
        int totalCostAdditionalExpenses = 0;
        totalCostAdditionalExpenses = calculationAdditionalCosts(numberOfTravelers, additionalExpenses);
        System.out.println("Total cost additional expenses = " + totalCostAdditionalExpenses + "$");
        int totalTravelCost = 0;
        totalTravelCost = calculationTotalTravelCost(fullFlightCost, totalCostAdditionalExpenses);
        System.out.println("Total travel cost = " + totalTravelCost + "$");

        int differenceOne = numberOfAvailableTicketsInFirstBoxOffice - numberOfTravelers;
        int checkingOne = checkingAvailableTickets(numberOfAvailableTicketsInFirstBoxOffice, numberOfTravelers);

        int differenceTwo = numberOfAvailableTicketsInSecondBoxOffice - numberOfTravelers;
        int checkingTwo = checkingAvailableTickets(numberOfAvailableTicketsInSecondBoxOffice, numberOfTravelers);

        int differenceThree = numberOfAvailableTicketsInThirdsBoxOffice - numberOfTravelers;
        int checkingThree = checkingAvailableTickets(numberOfAvailableTicketsInThirdsBoxOffice, numberOfTravelers);

        outputNumberOfTickets(checkingOne, differenceOne);
        outputNumberOfTickets(checkingTwo, differenceTwo);
        outputNumberOfTickets(checkingThree, differenceThree);
    }

    public static void greeting() {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Hello everyone!");
        System.out.println("Welcome to board the plane that flies to Egypt,");
        System.out.println("Pleasant flight");
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
        if(numberOfTravelers < numberOfAvailableTickets) {
            return 1;
        } else if(numberOfTravelers == numberOfAvailableTickets) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void outputNumberOfTickets(int checkingTickets , int difference){
        if(checkingTickets == 1) {
            System.out.println("Enough tickets for more passengers");
            System.out.println("Remaining tickets = " + difference);
        }
        else if(checkingTickets == 0) {
            System.out.println("Enough tickets for all passengers");
            System.out.println("Remaining tickets = " + difference);
        }
        else {
            if(difference < 0) {
                difference = difference * (-1);
            }
            System.out.println("There are not enough tickets for all passengers");
            System.out.println("Not enough tickets = " + difference);
        }

    }
}

