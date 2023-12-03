public class ChicagoStyleClamPizza extends Pizza
{
	public ChicagoStyleClamPizza() 
	{
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Clams");
        toppings.add("Jalapeons");
    }

    void cut() 
	{
        System.out.println("Cutting the pizza into square slices");
    }

}