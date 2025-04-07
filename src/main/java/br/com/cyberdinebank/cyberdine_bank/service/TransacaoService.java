//package br.com.cyberdinebank.cyberdine_bank.service;
//
//import br.com.cyberdinebank.cyberdine_bank.domain.contaBancaria.Conta;
//import br.com.cyberdinebank.cyberdine_bank.domain.contaBancaria.ContaRepository;
//import br.com.cyberdinebank.cyberdine_bank.domain.transacao.TipoTransacao;
//import br.com.cyberdinebank.cyberdine_bank.domain.transacao.Transacao;
//import br.com.cyberdinebank.cyberdine_bank.domain.transacao.TransacaoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class TransacaoService {
//
//    @Autowired
//    private TransacaoRepository transacaoRepository;
//
//    @Autowired
//    private ContaRepository contaRepository;
//
//    public Transacao realizarTransacao(Transacao transacao) {
//        // Lógica de movimentação financeira
//        Conta contaOrigem = contaRepository.findById(transacao.getContaOrigem().getId())
//                .orElseThrow(() -> new RuntimeException("Conta de origem não encontrada"));
//
//        if (transacao.getContaDestino() != null) {
//            Conta contaDestino = contaRepository.findById(transacao.getContaDestino().getId())
//                    .orElseThrow(() -> new RuntimeException("Conta de destino não encontrada"));
//
//            contaOrigem.setSaldo(contaOrigem.getSaldo().subtract(transacao.getValor()));
//            contaDestino.setSaldo(contaDestino.getSaldo().add(transacao.getValor()));
//
//            contaRepository.save(contaOrigem);
//            contaRepository.save(contaDestino);
//        } else {
//            // Saque ou depósito
//            if (transacao.getTipoTransacao() == TipoTransacao.SAQUE) {
//                contaOrigem.setSaldo(contaOrigem.getSaldo().subtract(transacao.getValor()));
//            } else {
//                contaOrigem.setSaldo(contaOrigem.getSaldo().add(transacao.getValor()));
//            }
//            contaRepository.save(contaOrigem);
//        }
//
//        return transacaoRepository.save(transacao);
//    }
//}
