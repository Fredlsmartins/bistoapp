package yourcompany.bistoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yourcompany.bistoapp.domain.dto.MunicipioDTO;
import yourcompany.bistoapp.service.MunicipioService;

import java.util.List;

@RestController
@RequestMapping("/munucipios")
public class MunicipioController {

    @Autowired
    private MunicipioService municipioService;

    @GetMapping("uf/1")
    public List<MunicipioDTO> list (@RequestBody MunicipioDTO dto) {
      return  municipioService.listar();
    }
}
