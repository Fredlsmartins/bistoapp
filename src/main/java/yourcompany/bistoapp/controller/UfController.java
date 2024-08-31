package yourcompany.bistoapp.controller;

import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yourcompany.bistoapp.domain.dto.MunicipioDTO;
import yourcompany.bistoapp.domain.dto.UfDTO;
import yourcompany.bistoapp.service.UfService;

import java.util.List;

@RestController
@RequestMapping("/")
public class UfController {

    @Autowired
    UfService ufService;


    @GetMapping("ufs")
    public List<UfDTO> list () {
        return  ufService.listar();
    }

    @GetMapping("/municipios/uf/{id}")
    public UfDTO list (@PathVariable @NotNull Long id) {
        return ufService.listar(id);
    }
}
