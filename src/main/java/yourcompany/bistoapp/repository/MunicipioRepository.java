package yourcompany.bistoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yourcompany.bistoapp.domain.entity.MunicipioEntity;

public interface MunicipioRepository extends JpaRepository <MunicipioEntity, Long> {
}
