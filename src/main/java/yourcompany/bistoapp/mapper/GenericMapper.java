package yourcompany.bistoapp.mapper;



import org.springframework.data.domain.Page;

import java.util.List;

public interface GenericMapper <E , DTO> {

    DTO toDTO(E entity);

    E toEntity(DTO dto);

    List<DTO> toListDTO(List<E> list);

    List<E> toListEntity(List<DTO> list);

    default Page<DTO> toPageDTO(Page<E> pageEntity) {
        return pageEntity.map(this::toDTO);
    }
}