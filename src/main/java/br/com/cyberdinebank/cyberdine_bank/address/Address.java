package br.com.cyberdinebank.cyberdine_bank.address;

import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String streetName;
    private String publicPlace;
    private String neighborhood;
    private String zipCode;
    private String house_number;
    private String complement;
    private String city;
    private String uf;

    public Address(AddressData data) {
        this.streetName = data.streetName();
        this.publicPlace = data.publicPlace();
        this.neighborhood = data.neighborhood();
        this.zipCode = data.zipCode();
        this.house_number = data.house_number();
        this.complement = data.complement();
        this.city = data.city();
        this.uf = data.uf();
    }

    public void updateInformation(AddressData data) {
        if (data.streetName() != null) {
            this.streetName = data.streetName();
        }

        if (data.publicPlace() != null) {
            this.publicPlace = data.publicPlace();
        }

        if (data.neighborhood() != null) {
            this.neighborhood = data.neighborhood();
        }

        if (data.zipCode() != null) {
            this.zipCode = data.zipCode();
        }

        if (data.house_number() != null) {
            this.house_number = data.house_number();
        }

        if (data.complement() != null) {
            this.complement = data.complement();
        }
    }
}
