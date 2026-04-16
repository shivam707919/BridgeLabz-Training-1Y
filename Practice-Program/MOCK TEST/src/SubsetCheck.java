import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 4};

        HashSet<Integer> set = new HashSet<>();
        for(int num : A) {
            set.add(num);
        }
        boolean isSubset = true;

        for(int num : B) {
            if(!set.contains(num)) {
                isSubset = false;
                break;
            }
        }

        System.out.println(isSubset);
    }
}

/*         *
          **
         ***
        ****
         ***
          **
           *

 */