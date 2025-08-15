package programmers.lastTwoProcessor;

import java.util.Arrays;

//마지막 두 원소
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] { 2, 1, 6 }))); // [2, 1, 6, 5]
        System.out.println(Arrays.toString(solution(new int[] { 5, 2, 1, 7, 5 }))); // [5, 2, 1, 7, 5, 10]
    }

    public static int[] solution(int[] num_list) {
        int len = num_list.length;
        int last = num_list[len - 1];
        int prev = num_list[len - 2];

        int newElement = last > prev ? last - prev : last * 2;
        // 원본 배열 복사 + 크기 확장
        int[] result = Arrays.copyOf(num_list, len + 1);
        // 새로 늘어난 공간에 값 추가
        result[len] = newElement;

        return result;
    }
}
