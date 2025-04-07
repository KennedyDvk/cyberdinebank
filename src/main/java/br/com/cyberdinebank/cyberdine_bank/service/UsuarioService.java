//package br.com.cyberdinebank.cyberdine_bank.service;
//
//import br.com.cyberdinebank.cyberdine_bank.domain.usuario.User;
//import br.com.cyberdinebank.cyberdine_bank.domain.usuario.UsuarioRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UsuarioService {
//
//    @Autowired
//    private UsuarioRepository usuarioRepository;
//
//    public User cadastrarUsuario(User usuario) {
//        return usuarioRepository.save(usuario);
//    }
//
//    public Optional<User> buscarPorEmail(String email) {
//        return usuarioRepository.findByEmail(email);
//    }
//
//    public User salvarUsuario(User usuario) {
//        // ✅ Garante que todas as contas associadas ao usuário recebam a referência correta
//        if (usuario.getContas() != null) {
//            usuario.getContas().forEach(conta -> conta.setUsuario(usuario));
//        }
//
//        return usuarioRepository.save(usuario);
//    }
//}
