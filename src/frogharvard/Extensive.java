import java.util.ArrayList;
import java.util.List;

public class Extensive
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(13);
        ArrayList<Integer> arrayList = new ArrayList<>();

        list.add(21);
        list.add(2423);
        list.add(21233);
        list.set(0, 5432);
        list.remove(2);

        arrayList.add(-342);
        arrayList.add(8902);

        list.addAll(arrayList);
        arrayList.clear();

        System.out.println(arrayList);
        System.out.println(list);
        System.out.println(list.indexOf(8902));
        System.out.println(list.lastIndexOf(-342));
        System.out.printf("Size of the list: %d\n", list.size());
        System.out.printf("Array List is empty: %b\n", arrayList.isEmpty());
        System.out.printf("is there 21: %b\n", list.contains(21));
    }
}
