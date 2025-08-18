package programmers.zeroFiveArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, 555)));
        System.out.println(Arrays.toString(solution(1, 4)));
    }

    /**
     * l 이상 r 이하에서 모든 자리가 0 또는 5인 수들을 오름차순 배열로 반환.
     * 없으면 [-1].
     */
    public static int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int x = l; x <= r; x++) {
            if (isZeroFive(x)) list.add(x);
        }
        if (list.isEmpty()) return new int[]{-1};
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) ans[i] = list.get(i);
        return ans;
    }

    private static boolean isZeroFive(int x) {
        // 0 자체는 허용(모든 자리 0) — 문제 정의에 맞게 처리
        if (x == 0) return true;
        int n = x;
        while (n > 0) {
            int d = n % 10;
            if (d != 0 && d != 5) return false;
            n /= 10;
        }
        return true;
    }
}
