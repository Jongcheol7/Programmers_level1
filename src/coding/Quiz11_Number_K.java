package coding;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz11_Number_K {

	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		sol.solution(array, commands);
	}

}
class Solution11 {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        ArrayList arrayList = new ArrayList();       
        int a = 0;
        
       
		Object[] aa = new Object[array.length];
        
		// array를 ArrayList 로 변환
        for(int i=0; i<array.length; i++) {
        	arrayList.add(array[i]);
        }
        
        // 변환된 ArrayList를 원화는 범위로 자른 후 정렬
        for(int j=0; j<commands.length; j++) {
        	aa = arrayList.subList(commands[j][0]-1, commands[j][1]).toArray();
        	Arrays.sort(aa);        	
//        	System.out.println(Arrays.toString(aa));
        	result[j] = (int) aa[commands[j][2]-1];
        }
  
        System.out.println(Arrays.toString(result));
        
        
        return result;
    }
}