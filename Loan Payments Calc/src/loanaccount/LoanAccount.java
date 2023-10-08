// Loan Payments Calc 1 Loan Account
/**
 * This class represents a Loan Account used to calculate monthly payments on loans
 * with varying interest rates and principal amounts.
 * Created by Fazlemalak Chimthanawala on 08/29
 * @author fazle
 */
package loanaccount;

public class LoanAccount {
    
    // Static variable to store the annual interest rate for all LoanAccount objects
    private static double annualInterestRate;
    
    // Instance variable to store the principal amount for this LoanAccount object
    private double principal;
    
    /**
     * Calculates the monthly payments for the loan.
     * @param numberOfPayments The number of monthly payments to be made.
     * @return The monthly payment amount.
     */
    public double calculateMonthlyPayments(int numberOfPayments) {
        double monthlyInterest;
        monthlyInterest = annualInterestRate / 12;
        double monthlyPayment;
        monthlyPayment = principal * (monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -numberOfPayments)));
        return monthlyPayment;
    }
    
    /**
     * Constructs a LoanAccount object with the specified principal amount.
     * @param principal The principal amount of the loan.
     */
    public LoanAccount(double principal) {
        this.principal = principal;
    }
    
    /**
     * Sets the annual interest rate for all LoanAccount objects.
     * @param annualInterestRate The annual interest rate in percentage.
     */
    public static void setAnnualInterestRate(double annualInterestRate) {
        LoanAccount.annualInterestRate = annualInterestRate / 100;
    }
    
    /**
     * The main method of the program that demonstrates LoanAccount calculations
     * with different interest rates and loan durations.
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create LoanAccount objects
        LoanAccount loan1 = new LoanAccount(5000);
        LoanAccount loan2 = new LoanAccount(31000);
       
        // Set the annual interest rate to 1%
        setAnnualInterestRate(1.0);
       
        // Display loan information and monthly payments for different loan durations
        System.out.print("Monthly payments for Loan 1 of $5000.00 and Loan 2 "
               + "of $31,000.00 for 3 year, 5 year, and 6 year loans at 1% interest rate");
        System.out.printf("%n%s%15s%15s%15s%n","Loan","3 years","5 years", "6 years");
        System.out.printf("%s%13s%14s%15s%n", "Loan1", 
               String.format("%.2f", loan1.calculateMonthlyPayments(36)), 
               String.format("%.2f", loan1.calculateMonthlyPayments(60)), 
               String.format("%.2f", loan1.calculateMonthlyPayments(72)));
        System.out.printf("%s%13s%15s%15s%n", "Loan2", 
               String.format("%.2f", loan2.calculateMonthlyPayments(36)), 
               String.format("%.2f", loan2.calculateMonthlyPayments(60)), 
               String.format("%.2f", loan2.calculateMonthlyPayments(72)));
       
        // Set the annual interest rate to 5%
        setAnnualInterestRate(5.0);
        System.out.printf("%n");
       
        // Display loan information and monthly payments for different loan durations
        System.out.print("Monthly payments for Loan 1 of $5000.00 and Loan 2 " 
               +"of $31,000.00 for 3 year, 5 year, and 6 year loans at 5% interest rate");
        System.out.printf("%n%s%15s%15s%15s%n","Loan","3 years","5 years", "6 years");
        System.out.printf("%s%13s%14s%15s%n", "Loan1", 
               String.format("%.2f", loan1.calculateMonthlyPayments(36)), 
               String.format("%.2f", loan1.calculateMonthlyPayments(60)), 
               String.format("%.2f", loan1.calculateMonthlyPayments(72)));
        System.out.printf("%s%13s%15s%15s%n", "Loan2", 
               String.format("%.2f", loan2.calculateMonthlyPayments(36)), 
               String.format("%.2f", loan2.calculateMonthlyPayments(60)), 
               String.format("%.2f", loan2.calculateMonthlyPayments(72)));
    }
}
