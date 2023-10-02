package fishingStore.repository;

import fishingStore.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//add some changes

@Repository
public interface BrandRepository extends JpaRepository<Brand,Long> {
    Brand findByName(String name);

}
