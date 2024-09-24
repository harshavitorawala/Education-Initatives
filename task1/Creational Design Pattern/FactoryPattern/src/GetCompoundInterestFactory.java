public class GetCompoundInterestFactory {
    public CompoundInterest getCompoundInterest(String compoundInterestType) {
        if (compoundInterestType == null) {
            return null;
        }
        if (compoundInterestType.equalsIgnoreCase("QUARTERLY")) {
            return new QuarterlyCompoundInterest();
        } else if (compoundInterestType.equalsIgnoreCase("MONTHLY")) {
            return new MonthlyCompoundInterest();
        } else if (compoundInterestType.equalsIgnoreCase("YEARLY")) {
            return new YearlyCompoundInterest();
        }
        return null;
    }
}

