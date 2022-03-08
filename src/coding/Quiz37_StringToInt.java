package coding;

public class Quiz37_StringToInt {

	public static void main(String[] args) {
		Solution37 sol = new Solution37();
		sol.solution("-1234");
	}
}
class Solution37 {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}