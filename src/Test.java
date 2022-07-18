public class Test
{
    public static void main(String[] args)
    {
        String str_1 = "Hello";
        String str_2 = "Hello";

        System.out.println(str_1.equals(str_2));
    }
}

class Animal 
{
    private int id;

    public Animal(int id)
    {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj)
    {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
