package coding;

import java.util.Arrays;
import java.util.Collections;

public class Quiz32_StringDesc {

	public static void main(String[] args) {
		Solution32 sol = new Solution32();
		sol.solution("Zbcdefg");
	}

}
class Solution32 {
    public String solution(String s) {
        String answer = "";
        // ���ڿ��� ������ ���ڷ� �迭�� ����
    	String[] StringToArray = s.split("");    	
    	Arrays.sort(StringToArray, Collections.reverseOrder());
    	for(String a : StringToArray) {
    		answer = answer + a;
    	}
    	System.out.println(answer);
    	
        return answer;
    }
}