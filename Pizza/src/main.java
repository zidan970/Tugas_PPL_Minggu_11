public class main 
{
	public static void main(String[] args)
	 {
	    pizza p1 = new pizza();
	    pizza p2 = new pizza();
	    String Toppings;
	    String NamePizza;

	    p1.setToppings("mozzarella and cheese");
	    p1.setNamePizza("Pizza 1");

	    Toppings = p1.getToppings();
	    NamePizza = p1.getNamePizza();

	    System.out.println(NamePizza + " has toppings " + Toppings);
	 
	    p2.setToppings("beef, mushroom and cheese");
	    p2.setNamePizza("Pizza 2");

	    Toppings = p2.getToppings();
	    NamePizza = p2.getNamePizza();
	    
	    System.out.println(NamePizza + " has toppings " + Toppings);
	 }
}