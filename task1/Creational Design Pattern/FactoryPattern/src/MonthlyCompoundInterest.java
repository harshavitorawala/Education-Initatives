public class MonthlyCompoundInterest extends CompoundInterest {
    
    public MonthlyCompoundInterest() {
        getN(); // Set n value
    }

    @Override
    void getN() {
        n = 12; // 12 months in a year
    }
}
