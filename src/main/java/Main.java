public class Main
{

    public  static void main( String [] args)
    {
        Dog dog1= new Dog("Терик", 12 , "fox ", "red");
        System.out.println(dog1);
        if ( dog1.equals(new Dog( "тузик", 2,"ретривер","чорний")))
        {
            System.out.println("Обьекты равны");
        }
        else
            {
                System.out.println(" не равны ");
            }

         moveAnimal (new Fish());

    }

    private static void moveAnimal(Animal animal)
    {
        animal.move();
    }


}
