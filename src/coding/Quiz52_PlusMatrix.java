package coding;

import java.util.Arrays;

public class Quiz52_PlusMatrix {

	public static void main(String[] args) {
		Solution52 sol = new Solution52();
//		int[][] arr1 = {{1,2},{2,3}};
//		int[][] arr2 = {{3,4},{5,6}};
		int[][] arr1 = {{1},{2}};
		int[][] arr2 = {{3},{4}};
		sol.solution(arr1, arr2);
	}

}
class Solution52 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1[0].length][arr1[0].length];
        int length = arr1[0].length;
        System.out.println(length);
        for(int i=0; i<length; i++) {
        	for(int k=0; k<length; k++) {
        		answer[i][k] = arr1[i][k] + arr2[i][k];
        	}     	
        }
        
        System.out.println(Arrays.toString(answer[0]));
        System.out.println(Arrays.toString(answer[1]));
        
        return answer;
    }
}