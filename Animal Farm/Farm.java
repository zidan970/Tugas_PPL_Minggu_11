
/**
 * Write a description of class animal_farm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Farm
{
    public static void main(String[] args)
    {
        FarmAnimal farm1 = new FarmAnimal();
        FarmAnimal farm2 = new FarmAnimal("John Chisum", 50, 12, 5, 10);

        System.out.println("Farmer Name : " + farm1.name());
        System.out.println("Cows        : " + farm1.cows());
        System.out.println("Horses      : " + farm1.horses());
        System.out.println("Pigs        : " + farm1.getPigs());
        System.out.println("Chickens    : " + farm1.getChickens());
        
        System.out.println();
        
        System.out.println("Farmer Name : " + farm2.getName());
        System.out.println("Cows        : " + farm2.getCows());
        System.out.println("Horses      : " + farm2.getHorses());
        System.out.println("Pigs        : " + farm2.getPigs());
        System.out.println("Chickens    : " + farm2.getChickens());
        
        System.out.println();
    }	
}
