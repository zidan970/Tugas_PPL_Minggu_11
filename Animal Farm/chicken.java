public class chicken
{
    private String makanan;      // makanan domba
    private int bobot;         // bobot domba

    public chicken ()
    {
        makanan = "";
        bobot = 0;
    }
    
    public chicken (String food, int weight)
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
