public class Extensive
{
    public static void main(String[] args)
    {
        Toyota model = new Toyota();
        model.mark();
    }
}

class Car
{
    public void mark() {}
}

class Toyota extends Car
{
    public void mark()
    {
        System.out.println("t-4512");
    }
}
