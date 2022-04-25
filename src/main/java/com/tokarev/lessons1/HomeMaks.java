package com.tokarev.lessons1;
import java.util.Scanner;

public class HomeMaks {

        public static void main(String[] args) {
            int optionDirection = 0;
            int countOfPassengers = 0;
            double userBalance = 0;
            int numberOfTickets = 0;
            double tiketPrice = 0;
            String destination = null;
            double fullFlyCost = 0;
            printGreetings();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name.");
            String userName = scanner.nextLine();
            System.out.println("We are very glad to see you,  " + userName + " !!!");
            System.out.println("We suggest choosing the Flight Destination Number: ");
            System.out.println("1 - Dubai, 2 - Rome, 3 - Ankara, 4 - Odessa, 5 - Lviv.");
            optionDirection = -1;
            while (optionDirection < 1 || optionDirection > 5) {
                System.out.println("Please enter the number direction ");
                optionDirection = getUserData(scanner);
                if (optionDirection < 1 || optionDirection > 5) {
                    System.out.println("Enter correct data...");
                }
            }
            countOfPassengers = -1;
            while (countOfPassengers <= 0) {
                System.out.println("Please enter the number of passengers ");
                countOfPassengers = getUserData(scanner);
                if (countOfPassengers <= 0) {
                    System.out.println("Enter correct data...");
                }
            }
            userBalance = -1;
            while (userBalance <= 0) {
                System.out.println("How much money do you have, " + userName + " ?");
                userBalance = getUserDataBalance(scanner);
                if (userBalance <= 0) {
                    System.out.println("Enter correct data...");
                }
            }
            scanner.close();

            switch (optionDirection) {
                case (1):
                    destination = " - Dubai ";
                    numberOfTickets = 20;
                    tiketPrice = 102.70;
                    break;
                case (2):
                    destination = " - Rome ";
                    numberOfTickets = 25;
                    tiketPrice = 150.00;
                    break;
                case (3):
                    destination = " - Ankara";
                    numberOfTickets = 25;
                    tiketPrice = 120.00;
                    break;
                case (4):
                    destination = " - Odessa";
                    numberOfTickets = 30;
                    tiketPrice = 20.00;
                    break;
                case (5):
                    destination = " - Lviv";
                    numberOfTickets = 40;
                    tiketPrice = 70.50;
                    break;
                default:
                    System.out.println("This direction is unacceptable! Please enter a direction from the suggested...");
            }
            System.out.println("Ticket price = " + tiketPrice);
            System.out.println("Count of passengers = " + countOfPassengers + " Person(s)");
            System.out.println("Destination = " + destination);
            System.out.println("Available for purchase  " + numberOfTickets + " ticket(s) for the flight to " + destination + ".");
            System.out.println();
            int ticketsResult = checkAvailableTickets(numberOfTickets, countOfPassengers);
            printResult(ticketsResult, numberOfTickets, countOfPassengers);
            fullFlyCost = calculateFullFlyCost(countOfPassengers, tiketPrice);
            System.out.println("Full fly cost to " + destination + " = " + fullFlyCost);
            double balanceResult = getRestOfBalance(userBalance, fullFlyCost);
            printBalanceResult(balanceResult);

            if (ticketsResult >= 0 && balanceResult >= 0) {
                System.out.println("All checks is ok.");
                System.out.println("In the name of " + userName + " Tickets purchased: " + countOfPassengers);
                System.out.println("Funds transferred to the balance of the company: " + (countOfPassengers * tiketPrice));
            } else {
                System.exit(0);
            }
            double additionalExpenses = 20.45;
            double fullAdditionalExpenses = calculateAdditionalExpenses(additionalExpenses, countOfPassengers);
            System.out.println();
            System.out.println("Full additional cost = " + fullAdditionalExpenses);
            double fullPrice = calculateFullPrice(fullAdditionalExpenses, fullFlyCost);
            System.out.println("Full price with additional express to " + destination + " = " + fullPrice);
        }

        public static int getUserData(Scanner scanner) {
            try {
                return Integer.parseInt(scanner.next());
            } catch (Exception e) {
                return -1;
            }
        }

        public static double getUserDataBalance(Scanner scanner) {
            try {
                return Double.parseDouble(scanner.next());
            } catch (Exception e) {
                return -1;
            }
        }

        public static int checkAvailableTickets(int numberOfTickets, int countOfPassengers) {
            return Integer.compare(numberOfTickets, countOfPassengers);
        }

        public static void printResult(int comparisonResult, int numberOfTickets, int countOfPassengers) {
            if (comparisonResult >= 0) {
                System.out.println();
                System.out.println("    Congratulations! There are enough tickets for everyone!");
                System.out.println("Remaining: " + (numberOfTickets - countOfPassengers) + " ticket(s)");
                System.out.println();
            } else {
                System.out.println("    Not enough: " + (countOfPassengers - numberOfTickets) + " ticket(s)");
                System.exit(0);
            }
        }

        public static double getRestOfBalance(double balance, double fullFlyCost) {
            return balance - fullFlyCost;
        }

        public static void printBalanceResult(double balanceResult) {
            if (balanceResult >= 0) {
                System.out.println("Balance Ok!");
                System.out.println("Your balance after buying tickets: " + (balanceResult) + " USD");
            } else {
                System.out.println("You don't have enough money on your balance!!!");
            }
        }

        public static double calculateFullPrice(double fullExp, double fullCount) {
            return fullExp + fullCount;
        }

        public static double calculateAdditionalExpenses(double exp, int count) {
            return exp * count;
        }

        public static double calculateFullFlyCost(int count, double ticketPrice) {
            return ticketPrice * count;
        }

        public static void printGreetings() {
            System.out.println("Hello!");
            System.out.println("Welcome to  our travel agency.");
        }
    }