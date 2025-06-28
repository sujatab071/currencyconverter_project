import java.util.Scanner;

    public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Currency Type
        System.out.println("Currency Converter (from INR)");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.print("Choose the currency (1-3): ");
        int choice = scanner.nextInt();

        System.out.print("Enter amount in INR: ");
        double inrAmount = scanner.nextDouble();

        double convertedAmount = 0.0;
        String currency = "";

        switch (choice) {
            case 1:
                convertedAmount = inrAmount * 0.012;  // Example: 1 INR = 0.012 USD
                currency = "USD";
                break;
            case 2:
                convertedAmount = inrAmount * 0.011;  // Example: 1 INR = 0.011 EUR
                currency = "EUR";
                break;
            case 3:
                convertedAmount = inrAmount * 0.0095;  // Example: 1 INR = 0.0095 GBP
                currency = "GBP";
                break;
            default:
                System.out.println("Invalid choice. Please run the program again.");
                System.exit(0);
        }

        System.out.printf("₹%.2f INR = %.2f %s\n", inrAmount, convertedAmount, currency);
        scanner.close();
    }
}


