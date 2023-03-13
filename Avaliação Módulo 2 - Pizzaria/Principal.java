import java.util.Map;

public class Principal {
    public static void main(String[] args) {

        //criacao de 3 pizzas com ingredientes diferentes
        Pizza pizzaUm = new Pizza(new String[] {"queijo", "tomate"});
        Pizza pizzaDois = new Pizza(new String[] {"bacon", "queijo", "tomate", });
        Pizza pizzaTres = new Pizza(new String[] {"queijo", "frango", "catupiry", "tomate", "bacon"});

        //instanciando um carrinho de compras e adicionando os objetos criados a partir da classe pizza
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(pizzaUm);
        carrinho.adicionaPizza(pizzaDois);
        carrinho.adicionaPizza(pizzaTres);

        //impressao do total do carrinho de compras e qnt de ingredientes
        System.out.println("Carrinho de compras: ");
        System.out.println(carrinho.getValorTotal());
        System.out.println("Ingredientes utilizados");

        for (Map.Entry<String, Integer> entry : Pizza.getingredientesTotaisContabilizados().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
