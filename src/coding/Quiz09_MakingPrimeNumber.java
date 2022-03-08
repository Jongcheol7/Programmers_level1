package coding;

public class Quiz09_MakingPrimeNumber {

	public static void main(String[] args) {
		Solution9 sol = new Solution9();
		int[] nums = {1,2,3,4};
	}

}
class Solution9 {
    public int solution(int[] nums) {
    	int count = 0;
    	for(int i=0; i<nums.length-2; i++) {
    		for(int j=i+1; j<nums.length-1; j++) {
    			for(int k=j+1; k<nums.length; k++) {
    				if(isPrime(nums[i]+nums[j]+nums[k]) ) {
    					count++;
    				}
    			}
    		}
    	}
        return count;
    }
    
    public boolean isPrime(int number) {
    	if(number == 2) {
    		return true;
    	}
    	for(int i=3; i<number; i++) {
    		if(number % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}