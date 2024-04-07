package builder.classes;

public class AddressBuilder {

    private Address address;

    private AddressBuilder() {
        address = new Address();
    }

    public static AddressBuilder builder() {
        return new AddressBuilder();
    }

    public AddressBuilder street(String street) {
        this.address.setStreet(street);
        return this;
    }

    public AddressBuilder complement(String complement) {
        this.address.setComplement(complement);
        return this;
    }

    public Address build() {
        return this.address;
    }

}