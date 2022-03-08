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
    	// ����� ������ ������ �迭 �����
        int[] aliquotPerNumber = new int[right - left + 1];
        
        // left ���� right���� �Ѱ��� �����ϸ� ����� ������ ã�´�.
        int j=0;
        for(int i=left; i<=right; i++) {
        	int count = 0;
        	// ���� ���ĺ��ʹ� ����� ������ 0�̹Ƿ� ���� ���������� �ݺ���
        	for(int a=1; a<=i/2; a++) {
        		if(i%a == 0) {
        			count++;		
        		}
        	}
        	// count�� 1�� ������ ������ right�ڽŵ� ����� �����̱� ����
        	aliquotPerNumber[j++] = count+1;
        }
      
        System.out.println(Arrays.toString(aliquotPerNumber));
        
        // ����� ������ ¦���� �� ���� ���ϰ� Ȧ���� ����.
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