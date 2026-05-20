class Solution {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        int[] result = new int[n];

        int common = 0;

        for (int i = 0; i < n; i++) {

            if (A[i] == B[i]) {
                common++;
            } else {

                if (setB.contains(A[i])) {
                    common++;
                }

                if (setA.contains(B[i])) {
                    common++;
                }
            }

            setA.add(A[i]);
            setB.add(B[i]);

            result[i] = common;
        }

        return result;
    }
}