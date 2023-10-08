package loan.account.hierarchy;

/**
 *
 * @author fazle
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s, %s %s", street, city, state, zipcode);
    }
}
