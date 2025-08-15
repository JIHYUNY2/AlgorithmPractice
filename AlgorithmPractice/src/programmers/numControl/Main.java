package programmers.numControl;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw")); // -1
        System.out.println(solution(10, "w")); // 11
        System.out.println(solution(5, "dda")); // 5 +10 +10 -10 = 15
    }

    /**
     * control의 각 문자에 따라 n을 조작해 최종 값을 반환
     * w:+1, s:-1, d:+10, a:-10
     */
    public static int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);
            switch (c) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
                default:
                    break;
            }
        }
        return n;
    }
}
