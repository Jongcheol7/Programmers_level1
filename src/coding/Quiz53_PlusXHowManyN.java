package coding;

import java.util.Arrays;

public class Quiz53_PlusXHowManyN {
//x��ŭ ������ �ִ� n���� ����
	
	public static void main(String[] args) {
		Solution53 sol = new Solution53();
		sol.solution(-4, 2);
	}

}
class Solution53 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for(int i=0; i<n; i++) {
        	answer[i] = num;
        	num = num + x;
        }        
        return answer;
    }
}