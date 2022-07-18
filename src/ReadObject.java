import java.io.ObjectInputStream;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.FileNotFoundException;

public class ReadObject
{
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        FileInputStream fis = new FileInputStream("folks.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person person_1 = (Person) ois.readObject();
        Person person_2 = (Person) ois.readObject();

        System.out.println(person_1);
        System.out.println(person_2);

        ois.close();
    }
}
