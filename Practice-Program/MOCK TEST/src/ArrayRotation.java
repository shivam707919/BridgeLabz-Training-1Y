import java.util.*;

public class ArrayRotation {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        int k = 3;
        int n = arr.length;

        int[] result = new int[n];

        for(int i = 0; i < n; i++) {
            result[i] = arr[(i + k) % n];
        }

        System.out.println(Arrays.toString(result));
    }
}