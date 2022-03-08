package coding;

import java.util.Arrays;

public class Quiz16_AliquotPlusNumber {

	public static void main(String[] args) {
		Solution16 sol = new Solution16();
		int left = 13;
		int right = 17;
		sol.solution(left, right);
	}

}
class Solution16 {
    public int solution(int left, int right) {
    	// 약수의 갯수를 저장할 배열 만들기
        int[] aliquotPerNumber = new int[right - left + 1];
        
        // left 부터 right까지 한개씩 증가하며 약수의 개수를 찾는다.
        int j=0;
        for(int i=left; i<=right; i++) {
        	int count = 0;
        	// 절반 이후부터는 약수의 갯수가 0이므로 절반 이전까지만 반복문
        	for(int a=1; a<=i/2; a++) {
        		if(i%a == 0) {
        			count++;		
        		}
        	}
        	// count에 1을 더해준 이유는 right자신도 약수에 포함이기 때문
        	aliquotPerNumber[j++] = count+1;
        }
      
        System.out.println(Arrays.toString(aliquotPerNumber));
        
        // 약수의 갯수가 짝수면 그 수를 더하고 홀수면 뺀다.
        int sum = 0;
        int num = left;
        for(int n : aliquotPerNumber) {
        	if(n%2 == 0) {
        		sum+=num++;
        	}else {
        		sum-=num++;
        	}
        }
        
        System.out.println(sum);
        
        return sum;
    }
}