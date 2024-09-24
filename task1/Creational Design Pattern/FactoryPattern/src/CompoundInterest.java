public abstract class CompoundInterest {
    protected double n;

    // Abstract method to set the value of n
    abstract void getN();

    // Method to calculate compound interest and return the amount
    public double calculateCompoundInterest(double principal, double rate, int time) {
        double amount = principal * Math.pow((1 + (rate / 100) / n), n * time);
        return amount; // Return the calculated amount
    }
}
