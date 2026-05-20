import java.util.*;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;
        int[] result = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        int common = 0;

        for (int i = 0; i < n; i++) {

            map.put(A[i], map.getOrDefault(A[i], 0) + 1);

            if (map.get(A[i]) == 2) {
                common++;
            }

            map.put(B[i], map.getOrDefault(B[i], 0) + 1);

            if (map.get(B[i]) == 2) {
                common++;
            }

            result[i] = common;
        }

        return result;
    }
}