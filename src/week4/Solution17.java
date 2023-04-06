package week4;

public class Solution17 {
	
    public int solution(int value, String unit) {
        int converted = 0;
        
        if(unit.equals("C")) {
        	converted = (int)(value*1.8)+32;
        }
        	
        return converted;
    }

	public static void main(String[] args) {
		 Solution17 sol = new Solution17();
	     int value = 527;
	     String unit = "C";
	     int ret = sol.solution(value, unit);
	     
	     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}

}
