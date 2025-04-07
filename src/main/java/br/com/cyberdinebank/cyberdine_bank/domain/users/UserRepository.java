package br.com.cyberdinebank.cyberdine_bank.domain.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
