package formation.guime.demo.services;

import formation.guime.demo.models.Recette;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import formation.guime.demo.repositories.RecetteRepository;

import java.util.List;

@Service
public class RecetteService {

    private RecetteRepository repository;

    public RecetteService(RecetteRepository repository) {
        this.repository = repository;
    }

    /**
     * Retourne la liste de toute les recettes
     * @return les recettes sauvegardés
     */
    public List<Recette> findAll() {
        return repository.findAll();
    }

    /**
     * Sauvegarde une nouvelle recette.
     * entity ne doit pas avoir d'id.
     * @param entity recette a sauvegarder
     * @return l'entité avec un nouveau id
     */
    public Recette insert(Recette entity) {
        return repository.insert(entity);
    }

    /**
     * Sauvegarde ou met a jour une recette.
     * Si la recette ne posséde pas d'id, alors il est sauvegardé ({@see RecetteService::insert}).
     * Sinon remplace la valeur sauvegarder par la nouvelle valeur.
     * @param entity nouvelle recette ou recette mit a jour.
     * @return l'entité identique a la version sauvegardé.
     */
    public Recette save(Recette entity) {
        return repository.save(entity);
    }

    /**
     * Recherche une recette en fonction de son id.
     * Si l'id n'est pas valide, retourne un status 404.
     * @param id de la recette a rechercher
     * @return la recette possédant cette id.
     */
    public Recette findById(String id) {
        return repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Le film d'id "+id+" n'existe pas."));
    }

    /**
     * Supprime, s'il existe, la recette en fonction de son id.
     * @param id de la recette a supprimé
     */
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
