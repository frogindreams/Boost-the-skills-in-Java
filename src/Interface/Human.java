package Interface;

public class Human implements Info
{
    public int id;
    public void saySomething()
    {
        System.out.println("Hello!");
    }

    @Override
    public void showInfo()
    {
        System.out.printf("id: %d", this.id);
    }
}
