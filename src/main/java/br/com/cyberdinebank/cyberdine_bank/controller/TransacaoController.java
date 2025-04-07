//package br.com.cyberdinebank.cyberdine_bank.controller;
//
//import br.com.cyberdinebank.cyberdine_bank.domain.transacao.Transacao;
//import br.com.cyberdinebank.cyberdine_bank.service.TransacaoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//public class TransacaoController {
//
//    @Autowired
//    private TransacaoService transacaoService;
//
//    @PostMapping
//    public ResponseEntity<Transacao> realizarTransacao(@RequestBody Transacao transacao) {
//        Transacao novaTransacao = transacaoService.realizarTransacao(transacao);
//        return ResponseEntity.status(HttpStatus.CREATED).body(novaTransacao);
//    }
//
//}
