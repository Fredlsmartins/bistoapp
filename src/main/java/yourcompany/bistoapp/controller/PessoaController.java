package yourcompany.bistoapp.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yourcompany.bistoapp.domain.dto.PessoaDTO;
import yourcompany.bistoapp.service.PessoaService;

@RestController
@RequestMapping ("/pessoa")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @PostMapping ("/")
    public PessoaDTO creacte (@RequestBody @Valid PessoaDTO dto) {
     var salvar = pessoaService.cadastrar(dto);
        return  salvar ;
    }

    @PutMapping("{id}")
    public PessoaDTO atualizar (@PathVariable Long id, @RequestBody @Valid PessoaDTO dto) {
        var atualiza = pessoaService.update(id, dto);
        return atualiza ;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deletar (@PathVariable Long id) {
       pessoaService.delete(id);
        return ResponseEntity.noContent().build();
    }



}
