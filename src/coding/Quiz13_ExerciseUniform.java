package coding;

import java.util.ArrayList;
import java.util.List;

public class Quiz13_ExerciseUniform {

	public static void main(String[] args) {
		Solution13 sol = new Solution13();
		int n = 3;
		int[] lost = {1,2};
		int[] reserve = {2,3};
		sol.solution(n, lost, reserve);
	}

}
class Solution13 {
	public int solution(int n, int[] lost, int[] reserve) {

		// ArrayList�� student�� ������ �л�����ŭ ��� ���� 1�� �ʱ�ȭ ��Ų��.
		List<Integer> student = new ArrayList<Integer>();
		for(int s=0; s<n; s++) {
			student.add(1);
		}
		System.out.println("1�� �ʱ�ȭ �Ǿ����� Ȯ�� : " + student);

		// �������� �л����� 1���� 0���� �ٲ۴�.
		for(int l=0; l<lost.length; l++) {
			student.set(lost[l]-1, 0);
		}
		// ������ �ִ� �л��� 1���� 2�� �ٲ۴�.
		for(int r=0; r<reserve.length; r++) {
			student.set(reserve[r]-1, 2);
		}
		
		// ������ �ִµ� ���������� ��� 1�� �ٲ۴�.
		int cnt = 0;
		for(int a : lost) {
			for(int b : reserve) {
				if(a == b) {
					student.set(lost[cnt]-1, 1);
				}
			}
			cnt++;
		}
		System.out.println("����� �������� �� ���� ���� : " + student);
		
		for(int i=0; i<n; i++) {
			if((int)(student.get(i)) == 2) {
				if(i==0) {
					if((int)(student.get(i+1)) == 0){
						student.set(i+1, 1);
						student.set(i, 1);
					}
				}else if(i == n-1) {
					if((int)(student.get(i-1)) == 0){
						student.set(i-1, 1);
						student.set(i, 1);
					}
				}else {
					if((int)(student.get(i-1)) == 0){
						student.set(i-1, 1);
						student.set(i, 1);
					}else if((int)(student.get(i+1)) == 0){
						student.set(i+1, 1);
						student.set(i, 1);
					}
				}
			}
		}

		System.out.println("������ �ִ� ����� �����ְ� �� �� :" + student);
		
		int total = 0;
		for(int k=0; k<n; k++) {
			if((int)(student.get(k)) != 0) {
				total++;
			}
		}
		
		System.out.println("ü������ �ִ� ���� �л� �� : "+total);

		return total;
	}
}