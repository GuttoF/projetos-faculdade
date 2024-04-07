package builder;

import builder.classes.AddressBuilder;

public class Builder {
    public static void main(String[] args) {
        var address = AddressBuilder.builder()
            .street("Rua José Soares")
            .complement("Apto 203")
            .build();
        
        System.out.println(address);
    }
}
