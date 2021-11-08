public class sheep
{
    private String makanan;      // makanan domba
    private int bobot;         // bobot domba

    public sheep()
    {
        makanan = "";
        bobot = 0;
    }
    
    public sheep (String food, int weight)
    {
        makanan = food;
        bobot = weight;
    }

    public String getFood()
    {
        return makanan;
    }

    public int getWeight()
    {
        return bobot;
    }
}
