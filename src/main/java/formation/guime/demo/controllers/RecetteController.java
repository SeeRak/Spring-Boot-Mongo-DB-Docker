package formation.guime.demo.controllers;

import formation.guime.demo.models.Recette;
import org.springframework.web.bind.annotation.*;
import formation.guime.demo.services.RecetteService;

import java.util.List;

@RestController
@RequestMapping("recettes")
@CrossOrigin
public class RecetteController {

    private RecetteService service;

    public RecetteController(RecetteService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<Recette> findAll() {
        return service.findAll();
    }

    @PostMapping("")
    public Recette insert(@RequestBody Recette entity) {
        return service.insert(entity);
    }

    @PutMapping("")
    public Recette save(@RequestBody Recette entity) {
        return service.save(entity);
    }

    @GetMapping("{id}")
    public Recette findById(@PathVariable String id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        service.deleteById(id);
    }
}
