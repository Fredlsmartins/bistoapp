package yourcompany.bistoapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import yourcompany.bistoapp.domain.dto.UfDTO;
import yourcompany.bistoapp.domain.entity.UfEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UfMapper extends GenericMapper <UfEntity, UfDTO>{
}
