package fishingStore.rest;
import fishingStore.entity.Reel;
import fishingStore.repository.BrandRepository;
import fishingStore.repository.ReelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ReelController {
    @Autowired
    private ReelRepository reelRepository;
    @Autowired
    private BrandRepository brandRepository;


    @PostMapping(value = "/reel")
    public void saveReel(@RequestBody Reel reel) {
        reelRepository.save(reel);
    }

    @GetMapping(value = "/reel/all")
    public List<Reel> getAllReel() {
        return reelRepository.findAll();
    }
    @DeleteMapping(value = "/reel/{id}")
    public void deleteReel(@PathVariable Long id){
        reelRepository.deleteById(id);
    }
}
