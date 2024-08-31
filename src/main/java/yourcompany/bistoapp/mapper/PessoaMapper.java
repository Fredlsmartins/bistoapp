package yourcompany.bistoapp.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import yourcompany.bistoapp.domain.dto.PessoaDTO;
import yourcompany.bistoapp.domain.entity.PessoaEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PessoaMapper extends GenericMapper<PessoaEntity, PessoaDTO> {
}
