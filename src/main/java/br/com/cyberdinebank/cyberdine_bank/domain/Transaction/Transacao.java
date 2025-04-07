//package br.com.cyberdinebank.cyberdine_bank.domain.transacao;
//
//import br.com.cyberdinebank.cyberdine_bank.domain.contaBancaria.Conta;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.math.BigDecimal;
//import java.util.Date;
//
//@Entity(name = "transacao")
//@Table(name = "transacoes")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class Transacao {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "conta_origem_id", nullable = false)
//    private Conta contaOrigem;
//
//    @ManyToOne
//    @JoinColumn(name = "conta_destino_id")
//    private Conta contaDestino; // Pode ser nulo para saques e depósitos
//
//    @Enumerated(EnumType.STRING)
//    @Column(nullable = false, length = 20)
//    private TipoTransacao tipoTransacao;
//
//    @Column(nullable = false)
//    private BigDecimal valor;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "data_transacao", nullable = false, updatable = false)
//    private Date dataTransacao = new Date();
//}
