// public class PizzaTestDrive
// {
// 	public static void main(String[] args) 
// 	{
//         PizzaStore nyStore = new NYPizzaStore();
//         PizzaStore chicagoStore = new ChicagoPizzaStore();

//         Pizza pizza = nyStore.orderPizza("cheese");
//         System.out.println("First order was a " + pizza.getName() + "\n");

//         pizza = nyStore.orderPizza("cheese");
//         System.out.println("Second order was a " + pizza.getName() + "\n");   
// 	}
// }




abstract class Pizza {
    abstract void prepare();
    abstract void bake();
    abstract void cut();
    abstract void box();
}

class NyStyleCheesePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Preparing New York style cheese pizza");
    }

    @Override
    void bake() {
        System.out.println("Baking New York style cheese pizza");
    }

    @Override
    void cut() {
        System.out.println("Cutting New York style cheese pizza");
    }

    @Override
    void box() {
        System.out.println("Boxing New York style cheese pizza");
    }
}

class ChicagoStyleCheesePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Preparing Chicago style cheese pizza");
    }

    @Override
    void bake() {
        System.out.println("Baking Chicago style cheese pizza");
    }

    @Override
    void cut() {
        System.out.println("Cutting Chicago style cheese pizza");
    }

    @Override
    void box() {
        System.out.println("Boxing Chicago style cheese pizza");
    }
}

class PizzaStore {
    // Factory method
    Pizza createPizza(String type) {
        if (type.equals("NY")) {
            return new NyStyleCheesePizza();
        } else if (type.equals("Chicago")) {
            return new ChicagoStyleCheesePizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza type");
        }
    }

    // Client method
    Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();

        // Order a New York style cheese pizza
        System.out.println("Ordering New York style cheese pizza:");
        Pizza nyPizza = pizzaStore.orderPizza("NY");

        // Order a Chicago style cheese pizza
        System.out.println("\nOrdering Chicago style cheese pizza:");
        Pizza chicagoPizza = pizzaStore.orderPizza("Chicago");
    }
}
