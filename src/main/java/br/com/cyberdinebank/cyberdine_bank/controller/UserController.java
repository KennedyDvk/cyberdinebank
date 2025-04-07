package br.com.cyberdinebank.cyberdine_bank.controller;

import br.com.cyberdinebank.cyberdine_bank.domain.users.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity register(@RequestBody UserRegistrationData data, UriComponentsBuilder uriBuilder) {
        var user = new User(data);
        repository.save(user);
        var uri = uriBuilder.path("/users/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(new userBreakdownData(user));
    }

//    Usamos o PagedResourcesAssembler para converter a Page<UserListData> em um PagedModel<EntityModel<UserListData>>,
//    que é o formato recomendado pelo Spring HATEOAS para respostas paginadas com metadados e links.
//    Precisamos passar uma função lambda (user -> EntityModel.of(user)) como segundo argumento,
//    pois o metodo toModel espera transformar cada item da lista em um EntityModel.
//    Isso evita o erro de tipos incompatíveis, onde o metodo esperava uma lista de EntityModel<UserListData>,
//    mas o tipo retornado estava sendo interpretado incorretamente como PagedModel<UserListData>.
    @GetMapping
    public ResponseEntity<PagedModel<EntityModel<UserListData>>> list(
            @PageableDefault(size = 10, sort = {"firstName"}) Pageable pagination,
            PagedResourcesAssembler<UserListData> assembler) {

        var page = repository.findAll(pagination).map(UserListData::new);

        return ResponseEntity.ok(
                assembler.toModel(page, user -> EntityModel.of(user))
        );
    }

}