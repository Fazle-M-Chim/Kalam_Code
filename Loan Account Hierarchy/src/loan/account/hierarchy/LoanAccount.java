package loan.account.hierarchy;

/**
 *
 * @author fazle
 */
public class LoanAccount {
    private double annualInterestRate;
    private double principal;
    private int months;
    
    public double calculateMonthlyPayments (int months)
    {
        double monthlyInterest;
        monthlyInterest = annualInterestRate / 12 / 100;
        double monthlyPayment;
        monthlyPayment = principal * (monthlyInterest / (1 - Math.pow(1 +monthlyInterest, -months)));
        return monthlyPayment;
    }
    
    public LoanAccount(double principal, double annualInterestRate, int months)
    {
        this.principal = principal;
        this.months = months;
        this.annualInterestRate = annualInterestRate;
    }
    
    public String toString() {
        return String.format("Principal: $%.2f%nAnnual Interest Rate: %.2f%%%nTerm of Loan in Months: %d%nMonthly Payment: $%.2f%n",
                principal, annualInterestRate, months, calculateMonthlyPayments(months));
    }
    
    public double getPrincipal() {
        return principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getMonths() {
        return months;
    }
}
