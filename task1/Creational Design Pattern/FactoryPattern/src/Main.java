import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        GetCompoundInterestFactory compoundInterestFactory = new GetCompoundInterestFactory();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the type for which the compound interest will be generated (QUARTERLY, MONTHLY, YEARLY): ");
        String compoundInterestType = br.readLine();

        System.out.print("Enter the principal amount (INR): ");
        double principal = Double.parseDouble(br.readLine());

        System.out.print("Enter the rate of interest (%): ");
        double rate = Double.parseDouble(br.readLine());

        System.out.print("Enter the time in years: ");
        int time = Integer.parseInt(br.readLine());

        CompoundInterest ci = compoundInterestFactory.getCompoundInterest(compoundInterestType);

        if (ci != null) {
            double amount = ci.calculateCompoundInterest(principal, rate, time);
            System.out.printf("\nAmount after %d years (%s): Rs. %.2f\n", time, compoundInterestType, amount);
        } else {
            System.out.println("Invalid compound interest type.");
        }
    }
}
