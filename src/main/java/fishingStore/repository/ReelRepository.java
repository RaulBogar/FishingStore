package fishingStore.repository;


import fishingStore.entity.Reel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ReelRepository extends JpaRepository<Reel, Long> {

    Set<Reel> findBySpoolCapacity(Integer spoolCapacity);

    Set<Reel> findByBrands(String brands);
}
