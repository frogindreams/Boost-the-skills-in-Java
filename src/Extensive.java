public class Extensive
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Dog dog = new Dog();

        test(animal);
        test(dog);
    }

    public static void test(Animal animal)
    {
        animal.eat();
    }
}
