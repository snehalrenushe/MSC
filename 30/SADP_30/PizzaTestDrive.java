public class PizzaTestDrive
{
	public static void main(String[] args) 
	{
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("First order was a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("cheese");
        System.out.println("Second order was a " + pizza.getName() + "\n");   
	}
}