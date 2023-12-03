public class ChicagoStyleCheesePizza extends Pizza
{
	public ChicagoStyleCheesePizza() 
	{
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Mayo");
        toppings.add("Cheddar");
    }

    void cut() 
	{
        System.out.println("Cutting the pizza into square slices");
    }

}