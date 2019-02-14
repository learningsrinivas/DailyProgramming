import com.sun.javafx.image.IntPixelGetter;

import java.util.*;

public class DistinctPairs {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(
             1,4,2,2,4,2,1,4,3,2,2,3,0
               );
       int ans = numberOfPairs(list,4);
       System.out.println(ans);
    }

    public static int numberOfPairs(List<Integer> a, long k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (Integer elemetns : a) {
            if (hashMap.containsKey(elemetns)) {
                hashMap.put(elemetns, hashMap.get(elemetns) + 1);
            } else {
                hashMap.put(elemetns, 1);
            }
        }
        for (Integer val : a) {
            if (hashMap.containsKey((int)k)) {
                count++;
                hashMap.remove((int)k);
            }
        }

        return count;
    }
}
