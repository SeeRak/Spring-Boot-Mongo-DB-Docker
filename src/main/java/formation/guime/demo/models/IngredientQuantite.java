package formation.guime.demo.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

@Data
public class IngredientQuantite {

    private int quantite;
    @DBRef
    private Ingredient ingredient;
}
