package formation.guime.demo.services;

import formation.guime.demo.models.Ingredient;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import formation.guime.demo.repositories.IngredientRepository;

import java.util.List;

@Service
public class IngredientService {

    private IngredientRepository repository;

    public IngredientService(IngredientRepository repository) {
        this.repository = repository;
    }

    /**
     * Retourne la liste de tout les ingredients
     * @return les ignredients sauvegardés
     */
    public List<Ingredient> findAll() {
        return repository.findAll();
    }

    /**
     * Sauvegarde un nouveau ingrédient.
     * entity ne doit pas avoir d'id.
     * @param entity ingredient a sauvegarder
     * @return l'entité avec un nouveau id
     */
    public Ingredient insert(Ingredient entity) {
        return repository.insert(entity);
    }

    /**
     * Sauvegarde ou met a jour un ingredient.
     * Si l'ingredient ne posséde pas d'id, alors il est sauvegardé ({@see IngredientService::insert}).
     * Sinon remplace la valeur sauvegarder par la nouvelle valeur.
     * @param entity nouveuu ingredient ou ingredient mit a jour.
     * @return l'entité identique a la version sauvegardé.
     */
    public Ingredient save(Ingredient entity) {
        return repository.save(entity);
    }

    /**
     * Recherche un ingredient en fonction de son id.
     * Si l'id n'est pas valide, retourne un status 404.
     * @param id de l'ingredient a rechercher
     * @return l'ingredient possédant cette id.
     */
    public Ingredient findById(String id) {
        return repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Le film d'id "+id+" n'existe pas."));
    }

    /**
     * Supprime, s'il existe, l'ingredient en fonction de son id.
     * @param id de l'ingredient a supprimé
     */
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
