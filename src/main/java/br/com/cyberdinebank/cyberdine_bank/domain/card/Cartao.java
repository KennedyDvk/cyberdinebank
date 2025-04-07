//package br.com.cyberdinebank.cyberdine_bank.domain.cartao;
//
//import br.com.cyberdinebank.cyberdine_bank.domain.contaBancaria.Conta;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.Date;
//
//@Entity(name = "cartao")
//@Table(name = "cartoes")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class Cartao {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "conta_id", nullable = false)
//    private Conta conta;
//
//    @Column(nullable = false, unique = true, length = 16)
//    private String numeroCartao;
//
//    @Temporal(TemporalType.DATE)
//    @Column(nullable = false)
//    private Date validade;
//
//    @Column(nullable = false, length = 3)
//    private String cvv;
//
//    @Enumerated(EnumType.STRING)
//    @Column(nullable = false, length = 10)
//    private TipoCartao tipoCartao;
//}
