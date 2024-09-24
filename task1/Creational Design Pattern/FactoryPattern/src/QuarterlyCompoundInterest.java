public class QuarterlyCompoundInterest extends CompoundInterest {

    public QuarterlyCompoundInterest() {
        getN(); // Set n value
    }

    @Override
    void getN() {
        n = 4; // 4 quarters in a year
    }
}