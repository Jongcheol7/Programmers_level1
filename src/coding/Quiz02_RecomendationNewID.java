package coding;

public class Quiz02_RecomendationNewID {

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		String newId = sol.solution("...!@BaT#*..y.abcdefghijklm");
		System.out.println(newId);
	}

}

class Solution2 {
	public String solution(String new_id) {

		new_id = new_id.toLowerCase(); //1?‹¨ê³? - ëª¨ë“  ??ë¬¸ìž?Š” ?†Œë¬¸ìžë¡?
		new_id = new_id.replaceAll("([^-_.0-9a-z])", ""); //2?‹¨ê³? - -._?‚˜ ?ˆ«?ž, ?†Œë¬¸ìžë¥? ? œ?™¸?•˜ê³? ëª¨ë‘ ? œê±?
		new_id = new_id.replaceAll("[.]{2,}", "."); //3?‹¨ê³? - .?´ ?‘ê°? ?—°?†?´ë©? ?•˜?‚˜ë¡? ë°”ê¾¸ê¸?
		new_id = new_id.replaceAll("^[.]", ""); //4?‹¨ê³? - .?œ¼ë¡? ?‹œ?ž‘?•˜ê±°ë‚˜ ??‚˜ë©? ì§??š°ê¸?
		new_id = new_id.replaceAll("[.]$", "");

		//5?‹¨ê³? - ê°’ì´ ?—†?œ¼ë©? aë¡? ì±„ìš°ê¸?
		if(new_id.equals("")) {
			new_id = "a"; 
		}

		//6?‹¨ê³? - 16?ž ?´?ƒ?´ë©? 15?žê¹Œì? ë§Œë“¤ê³?, ? ?žë¦¬ê? .?´ë©? ? œê±?
		if(new_id.length() >= 16) {     
			new_id = new_id.substring(0, 15);
			for(int i=0; i<new_id.length(); i++) {
				if(new_id.substring(new_id.length()-1).equals(".")) {
					new_id = new_id.substring(0, new_id.length()-1);
				}
			}
		}

		//7?‹¨ê³? - ê¸??žê°? 2?ž ?´?•˜ë©? ë§ˆì?ë§? ê¸??žë¥? ê³„ì† ?„£ê¸?
		while(true){
			if(new_id.length()<=2) {
				new_id = new_id.concat(new_id.substring(new_id.length()-1));
				continue;
			}
			break;
		}


		String answer = new_id;
		return answer;
	}
}
