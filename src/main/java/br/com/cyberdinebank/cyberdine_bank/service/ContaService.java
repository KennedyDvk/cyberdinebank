//package br.com.cyberdinebank.cyberdine_bank.service;
//
//import br.com.cyberdinebank.cyberdine_bank.domain.contaBancaria.Conta;
//import br.com.cyberdinebank.cyberdine_bank.domain.contaBancaria.ContaRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class ContaService {
//
//    @Autowired
//    private ContaRepository contaRepository;
//
//    public Conta criarConta(Conta conta) {
//        return contaRepository.save(conta);
//    }
//
//    public Optional<Conta> buscarPorNumero(String numeroConta) {
//        return contaRepository.findByNumeroConta(numeroConta);
//    }
//}
