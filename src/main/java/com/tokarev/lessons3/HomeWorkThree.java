package com.tokarev.lessons3;

public class HomeWorkThree {

    public static void main(String[] args) {
        int fullFlightCost = 0;
        int costOneTicket = 400;
        int numberOfTravelers = 47;
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
        System.out.print("Total travel cost = " + totalTravelCost + "$");
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
}
