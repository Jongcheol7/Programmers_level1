package coding;

import java.util.Arrays;

public class Quiz30_SortStrings {

	public static void main(String[] args) {
		Solution30 sol = new Solution30();
		sol.solution(new String[]{"sun", "bed", "car"}, 1);
	}

}
class Solution30 {
	public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for(int i=0; i<strings.length; i++) {
        	answer[i] = strings[i].charAt(n)+ strings[i];
        }
        Arrays.sort(answer);
        for(int i=0; i<answer.length; i++) {
        	answer[i] = answer[i].substring(1, answer[i].length());
        }
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}