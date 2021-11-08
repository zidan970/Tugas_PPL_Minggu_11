public class animalFarm
{
    private String hewan;
    private String makanan;
    private int bobot;
    
    public animalFarm(String name, String food, int weight)
    {
        hewan = name;
        makanan = food;
        bobot = weight;
    }

    public String getName()
    {
        return hewan;
    }

    public String getFood()
    {
        return makanan;
    }

    public int getWeight()
    {
        return bobot;
    }

    public void main(String[] args)
    {
        System.out.println("Hewan    : " + getName());
        System.out.println("Makanan  : " + getFood());
        System.out.println("Bobot    : " + getWeight());
        System.out.println();
    }   
}
