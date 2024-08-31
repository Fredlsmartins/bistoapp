package yourcompany.bistoapp.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
public class PessoaEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String rg;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private Long idMunicipio;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Long idGenero;

    private Boolean outroGenero;
}
