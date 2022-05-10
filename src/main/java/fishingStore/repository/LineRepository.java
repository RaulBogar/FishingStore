package fishingStore.repository;

import fishingStore.entity.Line;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Set;

@Repository
public interface LineRepository extends JpaRepository<Line, Long> {

    Set<Line> findByMaterial(String material);

    Set<Line> findByBrands(String brands);
}
