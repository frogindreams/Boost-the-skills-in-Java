public class AbstractClasses
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.makeSound();
    }
}

abstract class Animal
{
    public abstract void makeSound();
}

class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Myaa");
    }
}
