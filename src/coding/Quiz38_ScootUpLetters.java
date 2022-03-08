package coding;

import java.util.Arrays;

public class Quiz38_ScootUpLetters {

	public static void main(String[] args) {
		Solution38 sol = new Solution38();
		sol.solution("a B zzz", 25);
	}

}
class Solution38 {
    public String solution(String s, int n) {
        String answer = "";
        char[] moved = new char[s.length()];
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) == 'z' || s.charAt(i) == 'Z') {
        		moved[i] = (char)(s.charAt(i)+n-26);
        	}else if(s.charAt(i) == ' ') {
        		moved[i] = ' ';
        	}else {
        		moved[i] = (char)(s.charAt(i)+n);
        	}
        	
        	
        }
        for(char c : moved) {
        	answer = answer + c;
        }
        System.out.println(answer);
        
        return answer;
    }
}