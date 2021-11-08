public class farm_animal
{
    public static void main(String[] args)
    {
        sheep s1 = new sheep();
        sheep s2 = new sheep("Padi", 50);
                
        System.out.println("Embeekkkk Embeekkkk");
        System.out.println("Makanan   : " + s1.getFood());
        System.out.println("Bobot (kg): " + s1.getWeight());
        
        System.out.println();
        
        chicken c1 = new chicken();
        chicken c2 = new chicken("Jagung", 5);
        
        System.out.println("Kukkuruyuuukkk");
        System.out.println("Makanan   : " + c1.getFood());
        System.out.println("Bobot (kg): " + c2.getWeight());
        
        System.out.println();
    }	
}
