package programmers.codeProcessor;
/**
 * code를 규칙에 따라 처리하여 ret을 반환
 * '1'을 만나면 mode 토글(0<->1), 해당 문자는 건너뜀
 * mode==0: 짝수 인덱스만 추가
 * mode==1: 홀수 인덱스만 추가
 * ret이 비어 있으면 "EMPTY" 반환
 */
public class Main {
	public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc")); // acbac
        System.out.println(solution("1111"));        // EMPTY
        System.out.println(solution("a1b1c1d"));     // ac
    }

    public static String solution(String code) {
    	StringBuilder ret = new StringBuilder();
    	int mode = 0;
    	
    	for(int i = 0; i < code.length(); i++) {
    		char ch = code.charAt(i);
    		// mode 토글, 1이면 건너 뜀
    		if(ch == '1') {
    			mode = 1 - mode;
    			continue;
    		}
    		// mode가 0 이면 짝수 인덱스, 1이면 홀수 인덱스 추가(append)
    		if((mode == 0 && i%2 == 0) || (mode == 1 && i%2 == 1)) {
    			ret.append(ch);
    		}
    	}
    	return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}
