import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WriteObject
{
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        Person person_1 = new Person(19, "Kira");
        Person person_2 = new Person(24, "Michael");

        FileOutputStream fos = new FileOutputStream("folks.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(person_1);
        oos.writeObject(person_2);

        oos.close();
    }
}
