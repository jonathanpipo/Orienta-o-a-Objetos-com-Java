import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Pizza> pizzas = new ArrayList<Pizza>();

    public void adicionaPizza(Pizza pizza) {
        if (pizza.getPreco() > 0) {
            pizzas.add(pizza);
        }
    }

    public double getValorTotal() {
        double valorTotal = 0;

        for (Pizza pizza : pizzas) {
            valorTotal += pizza.getPreco();
        }

        return valorTotal;
    }

}
