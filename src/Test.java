public class Test
{
    public static void main(String[] args)
    {
        Car car = new Car(23);
        Car.Battery battery = new Car.Battery();

        car.start();
    }
}

class Car
{
    private int id;

    private class Motor
    {
        public void startMotor()
        {
            System.out.println("Starting the engine");
        }
    }

    public static class Battery
    {
        public void charge()
        {
            System.out.println("The battery is charging");
        }
    }

    public Car(int id)
    {
        this.id = id;
    }

    public void start()
    {
        Motor motor = new Motor();
        motor.startMotor();

        final int someVar = 0;
        
        class SomeClass
        {
            public void someMethod()
            {
                System.out.printf("The some var: %d", someVar);
            }
        }

        System.out.println("The car is gonna go");
    }
}
