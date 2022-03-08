package coding;

public class Quiz39_SumofAliquot {
	public static void main(String[] args) {
		Solution39 sol = new Solution39();
		sol.solution(12);
	}
	
}
class Solution39 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n/2; i++) {
        	if(n%i == 0) {
        		answer += i;
        	}
        }
        answer+=n;
        return answer;
    }
}