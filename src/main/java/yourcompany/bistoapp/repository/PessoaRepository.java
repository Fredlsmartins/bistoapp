package yourcompany.bistoapp.repository;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.data.jpa.repository.JpaRepository;
import yourcompany.bistoapp.domain.entity.PessoaEntity;


public interface PessoaRepository extends JpaRepository <PessoaEntity, Long> {
}
