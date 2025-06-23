import java.util.Scanner;
public class Main2 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter the principal amount:");
        principal = scanner.nextDouble();
        System.out.println("Enter the interest rate:");
        rate = scanner.nextDouble() / 100;
        System.out.println("Enter the number of time compounded by year:");
        timesCompounded = scanner.nextInt();
        System.out.println("Enter the number of years:");
        years = scanner.nextInt();
        //USE THE FORMULA TO CALCULATE INTEREST
        amount = principal * Math.pow( 1 + rate / timesCompounded, timesCompounded * years);
        System.out.printf("The amount after %d years is #%.2f", years, amount);

        scanner.close();

    }
}
