package coding;

import java.util.Arrays;

public class Quiz07_SumPlusMinus {

	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		sol.solution(absolutes, signs);
	}

}
class Solution7 {
    public int solution(int[] absolutes, boolean[] signs) {
    	int sum = 0;
    	for(int i=0; i<signs.length; i++) {
    		if(signs[i] == false) {
    			absolutes[i] = -absolutes[i];
    		}
    		sum += absolutes[i];
    	} 	
        System.out.println(sum);
        return sum;
    }
}