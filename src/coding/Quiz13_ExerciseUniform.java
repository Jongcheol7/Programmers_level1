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

		// ArrayList인 student를 만든후 학생수만큼 모든 값을 1로 초기화 시킨다.
		List<Integer> student = new ArrayList<Integer>();
		for(int s=0; s<n; s++) {
			student.add(1);
		}
		System.out.println("1로 초기화 되었는지 확인 : " + student);

		// 도난당한 학생들은 1에서 0으로 바꾼다.
		for(int l=0; l<lost.length; l++) {
			student.set(lost[l]-1, 0);
		}
		// 여분이 있는 학생은 1에서 2로 바꾼다.
		for(int r=0; r<reserve.length; r++) {
			student.set(reserve[r]-1, 2);
		}
		
		// 여분이 있는데 도난당했을 경우 1로 바꾼다.
		int cnt = 0;
		for(int a : lost) {
			for(int b : reserve) {
				if(a == b) {
					student.set(lost[cnt]-1, 1);
				}
			}
			cnt++;
		}
		System.out.println("사건이 벌어지고 난 후의 상태 : " + student);
		
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

		System.out.println("여분이 있는 사람이 나눠주고 난 후 :" + student);
		
		int total = 0;
		for(int k=0; k<n; k++) {
			if((int)(student.get(k)) != 0) {
				total++;
			}
		}
		
		System.out.println("체육복이 있는 최종 학생 수 : "+total);

		return total;
	}
}