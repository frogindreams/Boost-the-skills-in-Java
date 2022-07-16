import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class Test
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("text.txt");

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();

        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numbersString)
        {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
