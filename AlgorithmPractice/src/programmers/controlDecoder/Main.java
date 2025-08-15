package programmers.controlDecoder;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 0, 1, 11, 10 })); // wds
        System.out.println(solution(new int[] { 2, 12, 11, 1, 2 })); // dsaw
        System.out.println(solution(new int[] { 5, 4, 14, 4, 5, 15 })); // sadsd
    }

    /**
     * 인접한 두 값의 차이에 따라 조작 문자를 복원
     * 1->w, -1->s, 10->d, -10->a
     */
    public static String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        // i=0 부터 시작하면 numLog[-1] 존재하지 않는 인덱스가 추출되어 1부터 시작
        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];
            switch (diff) {
                case 1:
                    sb.append('w');
                    break;
                case -1:
                    sb.append('s');
                    break;
                case 10:
                    sb.append('d');
                    break;
                case -10:
                    sb.append('a');
                    break;
                default: // 문제 조건상 등장하지 않음
                    break;
            }
        }
        return sb.toString();
    }
}
