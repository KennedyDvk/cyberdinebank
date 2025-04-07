package br.com.cyberdinebank.cyberdine_bank.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressData(
        @NotBlank
        String streetName,
        @NotBlank
        String publicPlace,
        @NotBlank
        String neighborhood,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String zipCode,
        @NotBlank
        String house_number,
        String complement,
        @NotBlank
        String city,
        @NotBlank
        String uf) {
}
