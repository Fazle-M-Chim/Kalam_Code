package loan.account.hierarchy;

/**
 *
 * @author fazle
 */
public class CarLoan extends LoanAccount {
    private String vehicleVIN;
    
    public CarLoan(double principle, double annualInterestRate, int months, String vehicleVIN) {
        super(principle, annualInterestRate, months);
        this.vehicleVIN = vehicleVIN;
    }
    
    public String toString() {
        return String.format("Car Loan with:%n%s%nVehicle VIN: %s%n", super.toString(), vehicleVIN);
}
    }
