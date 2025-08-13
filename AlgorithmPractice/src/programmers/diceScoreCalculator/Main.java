package programmers.diceScoreCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(2, 6, 1)); // 9
        System.out.println(solution(5, 3, 3)); // 473
        System.out.println(solution(4, 4, 4)); // 110592
    }

    public static int solution(int a, int b, int c) {
        int sum1 = a + b + c;
        int sum2 = a * a + b * b + c * c;
        int sum3 = a * a * a + b * b * b + c * c * c;

        if (a == b && b == c) {
            return sum1 * sum2 * sum3; // 모두 같음
        } else if (a == b || b == c || c == a) {
            return sum1 * sum2; // 두 개만 같음
        } else {
            return sum1; // 모두 다름
        }
    }
}