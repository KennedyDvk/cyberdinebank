//package br.com.cyberdinebank.cyberdine_bank.controller;
//
//import br.com.cyberdinebank.cyberdine_bank.domain.contaBancaria.Conta;
//import br.com.cyberdinebank.cyberdine_bank.service.ContaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/contas")
//public class ContaController {
//
//    @Autowired
//    private ContaService contaService;
//
//    @PostMapping
//    public ResponseEntity<Conta> criar(@RequestBody Conta conta) {
//        Conta novaConta = contaService.criarConta(conta);
//        return ResponseEntity.status(HttpStatus.CREATED).body(novaConta);
//    }
//
//    @GetMapping("/{numeroConta}")
//    public ResponseEntity<Conta> buscarPorNumero(@PathVariable String numeroConta) {
//        return contaService.buscarPorNumero(numeroConta)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//}
