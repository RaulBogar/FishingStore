package fishingStore.rest;

import fishingStore.entity.Brand;
import fishingStore.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandController {

    @Autowired
   private BrandRepository brandRepository;

    @GetMapping(value = "/brand/all")
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    @PostMapping(value = "/brand")
    public void saveBrand(@RequestBody Brand brand) {
        brandRepository.save(brand);
    }
}
