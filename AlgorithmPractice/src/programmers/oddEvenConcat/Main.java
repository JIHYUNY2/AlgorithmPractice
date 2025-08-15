package programmers.oddEvenConcat;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 3, 4, 5, 2, 1 })); // 393
        System.out.println(solution(new int[] { 5, 7, 8, 3 })); // 581
        System.out.println(solution(new int[] { 2, 4, 6 })); // 짝수만 → oddNum=0
        System.out.println(solution(new int[] { 1, 3, 5 })); // 홀수만 → evenNum=0
    }

    /**
     * 홀수만 이어붙인 수 + 짝수만 이어붙인 수를 반환
     */
    public static int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int n : num_list) {
            if (n % 2 == 0) {
                even.append(n);
            } else {
                odd.append(n);
            }
        }

        // 문자열을 숫자로 변환할 때 빈 문자열이면 오류가 발생하기 때문에 삼항연산자 처리
        int evenNum = even.length() > 0 ? Integer.parseInt(even.toString()) : 0;
        int oddNum = odd.length() > 0 ? Integer.parseInt(odd.toString()) : 0;

        return evenNum + oddNum;
    }
}
