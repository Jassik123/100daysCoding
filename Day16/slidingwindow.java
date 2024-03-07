package classwork;


import java.util.*;

public class slidingwindow {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 4, 4, 4, 2, 2, 5, 6, 6, 7};
        int i = 0;
        int max = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int j = 0; j < arr.length; j++) {
            mp.put(arr[j], mp.getOrDefault(arr[j], 0) + 1);

            while (mp.size() > 2) {
                mp.put(arr[i], mp.get(arr[i]) - 1);
                if (mp.get(arr[i]) == 0)
                    mp.remove(arr[i]);
                i++;
            }

            max = Math.max(max, j - i + 1);

            System.out.println(max);
        }
    }
}