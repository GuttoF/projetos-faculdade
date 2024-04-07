package builder.classes;

public class Address {
    private String street;
    private String complement;

    protected Address() {
    }

    public static Address builder() {
        return new Address();
    }

    protected void setStreet(String street) {
        this.street = street;
    }

    protected void setComplement(String complement) {
        this.complement = complement;
    }

    @Override
    public String toString() {
        return "Address:{" +
                "street='" + street + '\'' +
                ", complement='" + complement + '\'' +
                '}';
    }

}
