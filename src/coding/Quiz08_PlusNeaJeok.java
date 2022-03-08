package coding;

public class Quiz08_PlusNeaJeok {

	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		sol.solution(a, b);
	}

}
class Solution8 {
    public int solution(int[] a, int[] b) {
    	int sum = 0;
    	for(int i=0; i<a.length; i++) {
    		sum += a[i]*b[i];
    	}
        return sum;
    }
}