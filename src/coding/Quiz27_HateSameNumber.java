package coding;

import java.util.ArrayList;
import java.util.List;

public class Quiz27_HateSameNumber {

	public static void main(String[] args) {
		Solution27 sol = new Solution27();
		sol.solution(new int[] {4,4,4,3,3});
	}

}
class Solution27 {
    public List<Integer> solution(int []arr) {
        
    	List<Integer> list = new ArrayList<>();
    	for(int i=1; i<arr.length; i++) {
    		if(arr[i] != arr[i-1]) {
    			list.add(arr[i-1]);
    		}
    	}
    	list.add(arr[arr.length-1]);
    	System.out.println(list);

    	return list;
    }
}