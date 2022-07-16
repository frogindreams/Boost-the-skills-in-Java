import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args) throws FileNotFoundException
    {
        readAFile();
    }

    public static void readAFile() throws FileNotFoundException
    {
        File file = new File("text");
        Scanner scanner = new Scanner(file);
    }
}
