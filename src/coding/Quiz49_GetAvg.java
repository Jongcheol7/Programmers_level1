package coding;

public class Quiz49_GetAvg {

	public static void main(String[] args) {
		Solution49 sol = new Solution49();
		sol.solution(new int[] {1,2,3,4});
	}

}
class Solution49 {
    public double solution(int[] arr) {
        int sum = 0;
        for(int a : arr) {
        	sum += a;
        }
        return sum / (double)arr.length;
    }
}