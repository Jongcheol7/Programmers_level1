package coding;

import java.util.Set;
import java.util.TreeSet;

public class Quiz14_Poketmon {

	public static void main(String[] args) {
		Solution14 sol = new Solution14();
		int[] nums = {3,1,2,3};
//		int[] nums = {3,3,3,2,2,4};
//		int[] nums = {3,3,3,2,2,2};
		sol.solution(nums);
	}

}
class Solution14 {
    public int solution(int[] nums) {
    	
    	int answer = 0;
    	Set<Integer> set = new TreeSet<Integer>();
    	
    	int cnt = 0;
    	for(int i : nums) {
    		set.add(nums[cnt++]);
    	}
    	int numberOfType = set.size();
    	System.out.println("�ߺ��� ������ ���� :" + set);
    	System.out.println("������ ���� :" + numberOfType);
    	
    	if((nums.length/2) < numberOfType) {
    		answer = nums.length/2;
    	}else {
    		answer = numberOfType;
    	}

    	System.out.println("�ִ�� ���� �� �ִ� ������ ���� :" + answer);
        return answer;
    }
}