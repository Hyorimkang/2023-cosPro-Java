package week1;

public class Solution2_1 {
	public int Solution2_1(int price, String grade) {
		int answer = 0;
		if(grade.equals("S")) {
			answer = (int)(price*0.95);
		}
		else if(grade.equals("G")) {
			answer = (int)(price*0.9);
		}
		else if(grade.equals("V")) {
			answer = (int)(price*0.85);
		}
		
		return answer;
	}
}
