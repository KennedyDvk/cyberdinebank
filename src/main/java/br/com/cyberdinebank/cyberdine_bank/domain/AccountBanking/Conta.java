//package br.com.cyberdinebank.cyberdine_bank.domain.contaBancaria;
//
//import br.com.cyberdinebank.cyberdine_bank.domain.usuario.User;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.math.BigDecimal;
//
//@Entity(name = "conta")
//@Table(name = "contas")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class Conta {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false, unique = true)
//    private String numeroConta;
//
//    @Column(nullable = false)
//    private String agencia;
//
//    @Column(nullable = false)
//    private BigDecimal saldo;
//
//    @Enumerated(EnumType.STRING)
//    @Column(nullable = false)
//    private TipoConta tipoConta;
//
//    @ManyToOne
//    @JoinColumn(name = "usuario_id", nullable = false)
//    private User usuario; // ⚠️ Esse campo NÃO pode estar nulo!
//}
