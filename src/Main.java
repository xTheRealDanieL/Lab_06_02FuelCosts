import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double gallon=0;
        double fuel=0;
        double price=0;

        System.out.println("Enter the number of gallon, fuel in miles per gallon and the price of gas per gallon: ");
        if(in.hasNextDouble())
        {
            gallon = in.nextDouble();
            fuel = in.nextDouble();
            price = in.nextDouble();
            in.nextLine();

            double cost100m = 100/fuel * price;
            double howFar = gallon * fuel;

            System.out.println("The cost per 100 miles is: " + cost100m);
            System.out.println("You can go " + howFar + " miles with the gas in the tank");
        }
        else
        {
            System.out.println("Please enter a valid input");
        }

    }
}