package yourcompany.bistoapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import yourcompany.bistoapp.domain.dto.MunicipioDTO;
import yourcompany.bistoapp.domain.entity.MunicipioEntity;

@Mapper (componentModel = MappingConstants.ComponentModel.SPRING)
public interface MunicipioMapper extends GenericMapper <MunicipioEntity, MunicipioDTO> {
}
