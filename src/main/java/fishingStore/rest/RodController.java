package fishingStore.rest;
import fishingStore.entity.Rod;
import fishingStore.repository.BrandRepository;
import fishingStore.repository.RodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RodController {
    @Autowired
    private RodRepository rodRepository;
    @Autowired
    private BrandRepository brandRepository;


    @PostMapping(value = "/rod")
    public void saveRod(@RequestBody Rod rod) {
        rodRepository.save(rod);
    }

    @GetMapping(value = "/rod/all")
    public List<Rod> getAllRod() {
        return rodRepository.findAll();
    }

    @DeleteMapping(value = "/rod/{id}")
    public void deleteRod(@PathVariable Long id) {
        rodRepository.deleteById(id);
    }
}

