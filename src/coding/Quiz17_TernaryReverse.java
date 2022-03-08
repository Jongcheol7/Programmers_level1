package coding;

public class Quiz17_TernaryReverse {

	public static void main(String[] args) {
		Solution17 sol = new Solution17();
		sol.solution(45);
	}

}
class Solution17 {
    public int solution(int n) {   
    	// ���ڿ��� �̿��Ͽ� ���� �������� �ϳ��ϳ� �ڿ� ���̸� �Ųٷ� �Էµȴ�.
        String sTernary = "";
        while(n > 0) {
        	sTernary += n%3;
        	n = n/3;
        }
        
        System.out.println(sTernary);
        // ���ڿ��� ������ �Է��ϸ� �װ��� 10�������� �ٲ��ش�.
        int nTernary = Integer.parseInt(sTernary, 3);
        System.out.println(nTernary);
        
        return nTernary;
    }
}