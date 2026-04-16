import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(5);

        System.out.println(list);
        HashSet<Integer> l=new HashSet<>(list);
        System.out.println(l);

    }
}
