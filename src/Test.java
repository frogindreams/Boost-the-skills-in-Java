import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String sep = File.separator;
        String path = sep + "home" + sep + "frogharvard" + sep + "dev" + sep + "Boost-the-skills-in-Java" + sep + "src" + sep + "text.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine())
        {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
