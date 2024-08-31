package yourcompany.bistoapp.service;

import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import yourcompany.bistoapp.domain.dto.PessoaDTO;
import yourcompany.bistoapp.domain.dto.UfDTO;
import yourcompany.bistoapp.domain.entity.PessoaEntity;
import yourcompany.bistoapp.mapper.PessoaMapper;
import yourcompany.bistoapp.repository.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
   private PessoaRepository pessoaRepository;
    @Autowired
   private PessoaMapper pessoaMapper;


    public PessoaDTO cadastrar (PessoaDTO pessoaDTO) {
            var post = pessoaMapper.toDTO (pessoaRepository.save(pessoaMapper.toEntity(pessoaDTO)));
            return post;
    }

    public PessoaDTO update ( Long id, PessoaDTO dto) {
        pessoaRepository.findById(id).orElseThrow(()-> new RuntimeException("O usuário não existe"));
        var update = pessoaMapper.toEntity (dto);
       var updated = pessoaRepository.save(update);
       var updateConversao = pessoaMapper.toDTO (updated);


        return  updateConversao ;
    }

    public void delete(Long id) {
        pessoaRepository.deleteById(id);
    }

    public List<PessoaDTO> listarparcial(PessoaDTO pessoaDTO){

        var viewTransfor = pessoaRepository.findAll(Example.of(pessoaMapper.toEntity(pessoaDTO)));
        var view = pessoaMapper.toListDTO(viewTransfor);

        return view;
    }
}
