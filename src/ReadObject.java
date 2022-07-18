import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.Arrays;

import java.io.IOException;
import java.io.FileNotFoundException;

public class ReadObject
{
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        FileInputStream fis = new FileInputStream("folks.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int personCount = ois.readInt();
        Person[] people = new Person[personCount];

        for (int i = 0; i < personCount; i++)
        {
            people[i] = (Person) ois.readObject();
        }

        System.out.println(Arrays.toString(people));

        ois.close();
    }
}
