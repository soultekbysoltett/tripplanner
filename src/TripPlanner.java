import java.util.Scanner;

public class TripPlanner {

    public static final int MINS_IN_HR = 60;
    public static final int HRS_IN_DAY = 24;
    public static final double MILES2_IN_KM2 = 0.386102;

    public static void main(String[] args) {
        greeting();
        //travelTimeBudget();
        //timeDifference();
        //countryArea();

    }

    public static void greeting() {

        Scanner greeting = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = greeting.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String destination = greeting.nextLine();

        if (destination.equals("USA")) {
            System.out.println("This destination is not available");
        } else if (destination.equals("China")) {
            System .out.print("Which City? ");
            String city = greeting.nextLine();
            System.out.println("Great " + city + ", " + destination + " sounds like a great trip");
        } else {
            System.out.println("Great " + destination + " sounds like a great trip");
        }

        System.out.println("***********");
        System.out.println();

    }

    public static void travelTimeBudget() {

        Scanner travel = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int travelDays = travel.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double money = travel.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = travel.next();
        System.out.print("How many " + currency + " are there in 1 USD.? ");
        double conversion = travel.nextDouble();
        System.out.println();

        var hours = HRS_IN_DAY * travelDays;
        var mins = hours * MINS_IN_HR;
        var perDay = money / travelDays;
        var convTotal = conversion * money;
        var convPerDay = convTotal / travelDays;

        int cast1 = (int) perDay * 100;
        double cast2 = cast1 / 100.0;

        int cast3 = (int) convTotal * 100;
        double cast4 = cast3 / 100.0;

        int cast5 = (int) convPerDay * 100;
        double cast6 = cast5 / 100.0;

        int cast7 = (int) money * 100;
        double cast8 = cast7 / 100.0;

        System.out.println("If you are travelling for " + travelDays + " days that is the same as " + hours + " hours or " + mins + " minutes");
        System.out.println("If you are going to spend " + cast8 + " USD that means per day you can spend up to " + cast2 + " USD ");
        System.out.println("Your total budget in " + currency + " is " + cast3 + " " + currency + ", which per day is " + cast5 + " " + currency);
        System.out.println("***********");
        System.out.println();

    }

    public static void timeDifference() {

        Scanner time = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");

        int timeZoneDiff = time.nextInt();
        int midnight = (timeZoneDiff + HRS_IN_DAY) % 24;

        System.out.println("That means that when it is midnight at home it will be " + midnight + ":00 in your travel destination");
        System.out.println("and when it is noon at home it will be " + midnight % 12 + ":00");

    }

    public static void countryArea() {

        Scanner area = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");

        double km2 = area.nextDouble();
        double cast1 = km2 * MILES2_IN_KM2;
        int cast2 = (int) cast1 * 100;
        double cast3 = cast2 / 100.0;

        System.out.println("In miles2 that is " + cast3);

    }

}
