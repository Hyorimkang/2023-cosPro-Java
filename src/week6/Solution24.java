package week6;

public class Solution24 {
	public int solution(String[] words, String word) {
     // 여기에 코드를 작성해주세요.
		int count = 0;
		for(int i = 0; i<words.length; i++) {
			for(int j = 0; j<4; j++) {
				if(word.charAt(j)!=(words[i].charAt(j))) {
					count++;
				}
			}
		}
		return count;
	}
 
	public static void main(String[] args) {
		Solution24 sol = new Solution24();
		String[] words = {new String("CODE"), new String("COED"), new String("CDEO")};
		String word = new String("CODE");
		int ret = sol.solution(words, word);
     
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}