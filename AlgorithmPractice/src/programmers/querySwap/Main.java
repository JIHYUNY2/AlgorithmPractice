package programmers.querySwap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4 };
        int[][] queries = { { 0, 3 }, { 1, 2 }, { 1, 4 } };
        System.out.println(Arrays.toString(solution(arr, queries))); // [3, 4, 1, 0, 2]
    }

    /**
     * 각 쿼리 [a, b]에 대해 arr[a]와 arr[b]를 교환하여 최종 배열을 반환
     */
    public static int[] solution(int[] arr, int[][] queries) {
        // queries의 배열을 각 q에 담아서 반복
        for (int[] q : queries) {
            int a = q[0], b = q[1];
            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
        return arr;
    }
}
