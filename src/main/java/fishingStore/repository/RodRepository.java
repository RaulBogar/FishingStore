package fishingStore.repository;


import fishingStore.entity.Rod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface RodRepository extends JpaRepository<Rod,Long> {
    Set<Rod> findByLength(Double length);

    Set<Rod> findByWeight(Integer weight);

    Set<Rod> findByMaxDrag(Integer maxDrag);

    Set<Rod> findByBrands(String brands);
}
