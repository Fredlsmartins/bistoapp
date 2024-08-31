package yourcompany.bistoapp.domain.dto;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {
    private Long id;
    private String name;
    @CPF
    private String cpf;
    private String rg;
    private String telefone;
    private Long idMunicipio;
    @Email (message = "Campo errado seu arrombado")
    private String email;
    private Long idGenero;
    private Boolean outroGenero;
}
