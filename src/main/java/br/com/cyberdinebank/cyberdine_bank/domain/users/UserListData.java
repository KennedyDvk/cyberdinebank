package br.com.cyberdinebank.cyberdine_bank.domain.users;

public record UserListData(Long id, String firstName, String lastName, String email, TypeUser typeUser) {

    public UserListData(User user) {
        this(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getTypeuser());
    }
}
