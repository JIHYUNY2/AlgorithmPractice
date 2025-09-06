package programmers.ArrayMaker4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 4, 2, 5, 3}))); // [1, 2, 3]
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4})));   // [1, 2, 3, 4]
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));   // [1]
    }

    /**
     * 배열 arr를 순회하며 규칙에 따라 stk를 만들어 반환
     */
    public static int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        for (int num : arr) {
            while (!stk.isEmpty() && stk.get(stk.size() - 1) >= num) {
                stk.remove(stk.size() - 1);
            }
            stk.add(num);
        }
        int[] ans = new int[stk.size()];
        for (int i = 0; i < stk.size(); i++) ans[i] = stk.get(i);
        return ans;
    }
}