package yourcompany.bistoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yourcompany.bistoapp.domain.dto.UfDTO;
import yourcompany.bistoapp.mapper.UfMapper;
import yourcompany.bistoapp.repository.UfRepository;

import java.util.List;

@Service
public class UfService {


    @Autowired
    private UfRepository ufRepository;
    @Autowired
    private UfMapper ufMapper;
    public List<UfDTO> listar (){

        var viewTransfor = ufRepository.findAll();
      var  view = ufMapper.toListDTO(viewTransfor);
        return view;
    }

    public UfDTO listar (Long id){

        var viewTransfor = ufRepository.findById(id).orElse(null);
        var view = ufMapper.toDTO(viewTransfor);
        return view;
    }


}
