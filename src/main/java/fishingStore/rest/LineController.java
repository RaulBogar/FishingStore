package fishingStore.rest;
import fishingStore.entity.Line;
import fishingStore.repository.BrandRepository;
import fishingStore.repository.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LineController {
    @Autowired
   private LineRepository lineRepository;
    @Autowired
    private BrandRepository brandRepository;

    @GetMapping(value = "/line/all")
    public List<Line> getAllLine() {
        return lineRepository.findAll();
    }

    @PostMapping(value = "/line")
    public void saveLine(@RequestBody Line lines) {
        lineRepository.save(lines);
     }


    @DeleteMapping(value = "/line/{id}")
    public void deleteLine(@PathVariable Long id){
        lineRepository.deleteById(id);
    }
}