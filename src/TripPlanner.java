import java.util.Scanner;

public class TripPlanner {

    public static final int MINS_IN_HR = 60;
    public static final int HRS_IN_DAY = 24;

    public static void main (String[] args) {
        greeting();
        travelTimeBudget();
    }

    public static void greeting() {

        Scanner greeting = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = greeting.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String destination = greeting.nextLine();
        System.out.println("Great " + destination + " sounds like a great trip");
        System.out.println("***********");
        System.out.println();

    }

    public static void travelTimeBudget() {

        Scanner travel = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int travelDays = travel.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int money = travel.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = travel.next();
        System.out.print("How many " + currency + " are there in 1 USD.?");
        System.out.println();

        var hours = HRS_IN_DAY * travelDays;
        var mins = hours * MINS_IN_HR;

        System.out.println("If you are travelling for " + travelDays + " days that is the same as " + hours + " or " + mins + "minutes");


    }
}
