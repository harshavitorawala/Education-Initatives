public class YearlyCompoundInterest extends CompoundInterest {

    public YearlyCompoundInterest() {
        getN(); // Set n value
    }

    @Override
    void getN() {
        n = 1; // 1 year
    }
}
