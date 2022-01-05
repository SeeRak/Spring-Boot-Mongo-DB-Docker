package formation.guime.demo.repositories;

import formation.guime.demo.models.Recette;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecetteRepository extends MongoRepository<Recette, String> {
}
