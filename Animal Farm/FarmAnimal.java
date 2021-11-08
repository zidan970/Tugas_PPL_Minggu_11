
/**
 * Write a description of class FarmAnimal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FarmAnimal
{
    private String name;      // The farmer's name
    private int cows;         // number of cows
    private int horses;       // number of horses
    private int pigs;         // number of pigs
    private int chickens;     // number of chickens

    public FarmAnimal()
    {
        name = "";
        cows = 0;
        horses = 0;
        pigs = 0;
        chickens = 0;
    }

    public FarmAnimal(String n, int c, int h, int p, int ch)
    {
        name = n;
        cows = c;
        horses = h;
        pigs = p;
        chickens = ch;
    }
}
