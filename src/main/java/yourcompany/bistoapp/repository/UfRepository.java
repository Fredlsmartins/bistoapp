package yourcompany.bistoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yourcompany.bistoapp.domain.entity.UfEntity;

public interface UfRepository extends JpaRepository <UfEntity, Long> {
}
