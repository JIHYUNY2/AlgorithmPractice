package programmers.productVsSumSquare;

//원소들의 곱과 합
public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 3, 4, 5, 2, 1 })); // 1
        System.out.println(solution(new int[] { 5, 7, 8, 3 })); // 0
        System.out.println(solution(new int[] { 1 })); // 0 (P=1, S^2=1)
        System.out.println(solution(new int[] { 1, 2, 3 })); // 1 (P=6, S^2=36)
    }

    /**
     * 모든 원소의 곱(P)과 합(S)의 제곱(S^2)을 비교하여
     * P < S^2 이면 1, 아니면 0을 반환
     */
    public static int solution(int[] num_list) {
        // 곱을 0으로 초기화하면 0이 되버림
        // int 대신 long을 쓴 이유는 곱과 제곱 연산에서 값이 커졌을 때 오버플로우를 방지하기 위함
        long product = 1;
        long sum = 0;
        for (int n : num_list) {
            product *= n;
            sum += n;
        }
        // 합이 최종 완성된 후 한번만 제곱하는게 효율성이 좋음
        long sumSq = sum * sum;
        return product < sumSq ? 1 : 0;
    }
}
