package br.com.cyberdinebank.cyberdine_bank.domain.users;
import br.com.cyberdinebank.cyberdine_bank.address.Address;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private String document;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_user")
    private TypeUser typeuser;

    @Embedded
    private Address address;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creation_date = new Date();

    public User(UserRegistrationData data) {
        this.firstName = data.firstName();
        this.lastName = data.lastName();
        this.email = data.email();
        this.document = data.document();
        this.typeuser = data.typeuser();
        this.address = new Address(data.address());
    }

//    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Conta> contas = new ArrayList<>();
}
