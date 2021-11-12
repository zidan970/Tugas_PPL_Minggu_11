public class pizza
	{
	  private String Toppings;
	  private String NamePizza;

	  public void setNamePizza(String n)
	  {
		NamePizza = n;  
	  }
	  
	  public void setToppings(String t)
	  {
	     Toppings = t;
	  }
	  
	  public String getNamePizza()
	  {
		return(NamePizza);
	  }

	  public String getToppings()
	  {
	     return(Toppings);
	  }
}