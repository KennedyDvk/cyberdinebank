package br.com.cyberdinebank.cyberdine_bank.domain.users;

import br.com.cyberdinebank.cyberdine_bank.address.Address;
import br.com.cyberdinebank.cyberdine_bank.address.AddressData;

public record userBreakdownData(
        Long id,
        String firstName,
        String lastName,
        String email,
        String document,
        TypeUser typeUser,
        Address address) {

    public userBreakdownData(User user) {
        this(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getDocument()
        ,user.getTypeuser(), user.getAddress());
    }
}
