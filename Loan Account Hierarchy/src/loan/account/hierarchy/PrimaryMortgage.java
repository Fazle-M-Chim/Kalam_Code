package loan.account.hierarchy;

/**
 *
 * @author fazle
 */
public class PrimaryMortgage extends LoanAccount{
    private double PMIMonthlyAmount;
    private Address address;

    public PrimaryMortgage(double principal, double annualInterestRate, int months, double PMIMonthlyAmount, Address address) {
        super(principal, annualInterestRate, months);
        this.PMIMonthlyAmount = PMIMonthlyAmount;
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                "PMI Monthly Amount: $" + PMIMonthlyAmount + "\n" + "Property Address: \n" + address + "\n";
    }
}
