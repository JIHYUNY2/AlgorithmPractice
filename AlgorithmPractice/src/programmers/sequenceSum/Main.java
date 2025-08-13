package programmers.sequenceSum;

public class Main {
    public static void main(String args[]) {
        boolean[] included = { true, false, false, true, true };
        System.out.println(solution(3, 4, included)); // 37
    }

    /**
     * 등차수열의 항 중 included[i] == true인 항만 더한 합계를 반환
     */
    public static int solution(int a, int d, boolean[] included) {
        int sum = 0;
        // length에 괄호를 붙이지 않는 이유는 배열의 길이이기 때문..
        // String이나 다른 클래스에서 길이를 구하는 메서드는 length()로 써야함
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                sum += a + d * i;
            }
        }
        return sum;
    }
}
