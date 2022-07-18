import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WriteObject
{
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        Person[] people = { new Person(1, "Bob"),
                            new Person(2, "Tom"),
                            new Person(3, "Man") };

        FileOutputStream fos = new FileOutputStream("folks.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeInt(people.length);

        for (Person person : people)
        {
            oos.writeObject(person);
        }

        oos.close();
    }
}
