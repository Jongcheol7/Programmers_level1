package coding;

public class Quiz21_MinimunRectangle {

	public static void main(String[] args) {
		Solution21 sol = new Solution21();
		//int[][] sizes = {{60,50},{30,70},{60,30},{80,40}}; //80,70 -> 80,50
		int[][] sizes = {{10,7},{12,3},{8,15},{14,7},{5,15}}; //14,15 -> 8,15
		//int[][] sizes = {{14,4},{19,9},{6,16},{18,7},{7,11}}; //19,16 -> 19,9
		sol.solution(sizes);
		 for (int[] size0 : sizes) {
			 System.out.print("size[0]: " + size0[0] + ",  ");
		 }
		 for (int[] size1 : sizes) {
			 System.out.print("size[1]: " + size1[1] + ",  ");
		 }
	}
	

}
class Solution21 {
	public int solution(int[][] sizes) {
		int answer = 0;

		int leftTop = 0;
		int rightTop = 0;
		String fixed = "";

		for(int i=0; i<sizes.length; i++) {
			if(leftTop < sizes[i][0]) {
				leftTop = sizes[i][0];
			}
			if(rightTop < sizes[i][1]) {
				rightTop = sizes[i][1];
			}
		}
		System.out.println("left:"+leftTop+", right:"+rightTop);
		if(leftTop > rightTop) {
			fixed = "left";
		}
		System.out.println("fixed:" + fixed);
		
		if(fixed == "left") {
			rightTop = 0;
			for(int k=0; k<sizes.length; k++) {
				if(sizes[k][0] < sizes[k][1]) {
					int tmp = 0;
					tmp = sizes[k][0];
					sizes[k][0] = sizes[k][1];
					sizes[k][1] = tmp;
				}
			}
			for(int l=0; l<sizes.length; l++) {
				if(rightTop < sizes[l][1]) {
					rightTop = sizes[l][1];
				}
			}
		}else {
			leftTop = 0;
			for(int k=0; k<sizes.length; k++) {
				if(sizes[k][0] > sizes[k][1]) {
					int tmp = 0;
					tmp = sizes[k][0];
					sizes[k][0] = sizes[k][1];
					sizes[k][1] = tmp;
				}
			}
			for(int l=0; l<sizes.length; l++) {
				if(leftTop < sizes[l][0]) {
					leftTop = sizes[l][0];
				}
			}
		}
		System.out.println("left:"+leftTop+", right:"+rightTop);
		
		answer = leftTop * rightTop;

		return answer;
	}
}