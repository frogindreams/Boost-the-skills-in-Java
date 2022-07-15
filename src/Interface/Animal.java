package Interface;

public class Animal implements Info
{
    public int id;
    public void sleep()
    {
        System.out.println("Im sleeping");
    }

    @Override
    public void showInfo()
    {
        System.out.printf("id: %d", this.id);
    }
}
