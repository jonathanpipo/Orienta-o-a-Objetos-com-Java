import java.util.HashMap;
import java.util.Map;

public class Pizza {
    private static Map<String, Integer> ingredientesTotaisContabilizados = new HashMap<String, Integer>();
    private String[] ingredientesObjPizza;

    //constructor
    ////
    public Pizza(String[] ingredientesObjPizza) {
        this.ingredientesObjPizza = ingredientesObjPizza;
        contabilizaIngrediente(ingredientesObjPizza);
    }

    public static void contabilizaIngrediente(String[] ingredientesObjPizza) {
        for (String ingrediente : ingredientesObjPizza) {
            if (ingredientesTotaisContabilizados.containsKey(ingrediente)) {
                ingredientesTotaisContabilizados.put(ingrediente, ingredientesTotaisContabilizados.get(ingrediente) + 1);
            } else {
                ingredientesTotaisContabilizados.put(ingrediente, 1);
            }
        }
    }

    public double getPreco() {
        int qntIngredientes = ingredientesObjPizza.length;

        if (qntIngredientes <= 2) {
            return 15;
        } else if (qntIngredientes <= 5) {
            return 20;
        } else {
            return 23;
        }
    }

    public static Map<String, Integer> getingredientesTotaisContabilizados() {
        return ingredientesTotaisContabilizados;
    }
}