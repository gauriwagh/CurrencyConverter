package Program;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be converted");
        double amount = sc.nextDouble();
        System.out.println("Enter the source currency");
        String sourcecurrency = sc.next();
        System.out.println("Enter target currency");
        String targetcurrency = sc.next();
        double exchangeRate = getExchangeRate(sourcecurrency, targetcurrency);
        double convertedAmount=amount*exchangeRate;
        System.out.println("Converted Amount:" + convertedAmount);
    }
    private static double getExchangeRate(String sourcecurrency,String targetcurrency){
        return 1.0;
    }
}
