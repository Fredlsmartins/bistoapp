package yourcompany.bistoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yourcompany.bistoapp.domain.dto.MunicipioDTO;
import yourcompany.bistoapp.domain.entity.MunicipioEntity;
import yourcompany.bistoapp.mapper.MunicipioMapper;
import yourcompany.bistoapp.repository.MunicipioRepository;

import java.util.List;

@Service
public class MunicipioService {

    @Autowired
    private MunicipioRepository municipioRepository;

    @Autowired
    private MunicipioMapper municipioMapper;

    public List<MunicipioDTO> listar (){

       var lista = municipioMapper.toListDTO(municipioRepository.findAll());

        return lista;
    }

}
