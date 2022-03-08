package coding;

import java.util.Arrays;

public class Quiz06_PlusEmptyNumber {

	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		int[] numbers = {1,2,3,4,6,7,8,0};
		sol.solution(numbers);
	}

}
class Solution6 {
    public int solution(int[] numbers) {
    	int sum = 0;
    	int[] compare = new int[10];
    	for(int i=0; i<numbers.length; i++) {
    		compare[numbers[i]] = numbers[i];
    	}
    	for(int i=0; i<compare.length; i++) {
    		if(compare[i] == 0) {
    			sum += i;
    		}
    	}
        return sum;
    }
}