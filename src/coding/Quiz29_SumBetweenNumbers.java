package coding;

public class Quiz29_SumBetweenNumbers {

	public static void main(String[] args) {
		Solution29 sol = new Solution29();
		sol.solution(3, 5);
	}

}
class Solution29 {
    public long solution(int a, int b) {
        long answer = 0;
        int tmp = 0;
        if(a > b) {
        	tmp = a;
        	a = b;
        	b = tmp;
        }
        for(int i=a; i<=b; i++) {
        	answer += i;
        }
        return answer;
    }
}