package coding;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Quiz19_Pick2Plus {

	public static void main(String[] args) {
		Solution19 sol = new Solution19();
		int[] numbers = {2,1,3,4,1};
		sol.solution(numbers);
	}

}
class Solution19 {
    public int[] solution(int[] numbers) {

    	// �迭���� 2���� ���� �̾Ƽ� ���� ���ؾ��ϴ� ����Ǽ��� �����ϸ�
    	// ���ؼ� ���� ���� ���� �� ������ �ߺ��� �����ϱ� ���� set�� ����Ѵ�.
    	// �ѹ��� ���ı��� ���ִ� treeset�� �̿��غ���.
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<numbers.length-1; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        System.out.println(set);
        
        // set�� �迭�� ��ȯ�Ѵ� �۾��� �Ѵ�.
        Object[] a = set.toArray();
        int[] answer = new int[a.length];
        for(int n=0; n<a.length; n++) {
        	answer[n] = (int) a[n];
        }
        
        System.out.println(Arrays.toString(answer));
           
        return answer;
    }
}