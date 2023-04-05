package week3;

public class Solution9 {
	public String solution(String charactors) {
		String result = "";
		result += charactors.charAt(0);
		
		for(int i = 0; i<charactors.length()-1; i++) {
			if(charactors.charAt(i) != charactors.charAt(i+1)) {
				result += charactors.charAt(i+1);
			}//if`
		}//for
		return result;
	}
	
	public static void main(String[] args) {
		Solution9 sol = new Solution9();
		String charactors = "seeeeeeeeeennnnteeeeennnnccccce";
		String ret = sol.solution(charactors);

		System.out.println("Solution: return value of the method is " + ret + ".");
	}

}
