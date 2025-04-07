package br.com.cyberdinebank.cyberdine_bank.domain.users;

import br.com.cyberdinebank.cyberdine_bank.address.Address;
import br.com.cyberdinebank.cyberdine_bank.address.AddressData;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record UserRegistrationData(
        @NotBlank
        String firstName,
        @NotBlank
        String lastName,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{14}")
        String document,
        @NotNull
        TypeUser typeuser,
        @NotNull
        @Valid
        AddressData address) {
}
