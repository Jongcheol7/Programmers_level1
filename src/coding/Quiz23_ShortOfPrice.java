package coding;

public class Quiz23_ShortOfPrice {

	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		sol.solution(3, 20, 4);
	}

}
class Solution23 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long totalPrice = 0;
        for(int i=1; i<=count; i++) {
        	totalPrice += (price*i);
        }
        System.out.println(totalPrice);
        if(totalPrice > money) answer = totalPrice - money;
        return answer;
    }
}