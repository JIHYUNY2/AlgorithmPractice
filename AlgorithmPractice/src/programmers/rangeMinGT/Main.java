package programmers.rangeMinGT;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 4, 3 };
        int[][] queries = { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 2, 2 } };
        System.out.println(Arrays.toString(solution(arr, queries))); // [3, 4, -1]
    }

    /**
     * 각 쿼리 [s, e, k]에 대해 arr[s..e]에서 k보다 큰 값 중 최솟값을 찾아 결과 배열에 담아 반환
     * 없으면 -1.
     */
    public static int[] solution(int[] arr, int[][] queries) {
        int[] ans = new int[queries.length];

        for (int qi = 0; qi < queries.length; qi++) {
            int s = queries[qi][0];
            int e = queries[qi][1];
            int k = queries[qi][2];

            int best = Integer.MAX_VALUE;
            for (int i = s; i <= e; i++) {
                int v = arr[i];
                if (v > k && v < best)
                    best = v;
            }
            ans[qi] = (best == Integer.MAX_VALUE) ? -1 : best;
        }

        return ans;
    }
}
