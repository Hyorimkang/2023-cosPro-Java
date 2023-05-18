package week7;

public class Solution27 {
	   public int solution(int numApple, int numCarrot, int k) { //10,5,4
	        int answer = 0;
	        
	        if(numApple < 3 * numCarrot)
	            answer = numApple / 3; //3
	        else
	            answer = numCarrot;
	        
	        numApple -= 3 * answer; //10-9=  1
	        numCarrot -= answer; //5-3=  2

	        for(int i = 0; k - (numApple + numCarrot + i) > 0; i++)//4-(1+2+2)
	            if(i % 4 == 0)
	            	answer--;
	        return answer;
	    }
	    
	    public static void main(String[] args) {
	        Solution27 sol = new Solution27();
	        int numApple1 = 5;
	        int numCarrot1 = 1;
	        int k1 = 2;
	        int ret1 = sol.solution(numApple1, numCarrot1, k1);
	        
	        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
	        
	        int numApple2 = 10;
	        int numCarrot2 = 5;
	        int k2 = 4;
	        int ret2 = sol.solution(numApple2, numCarrot2, k2);
	        
	        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	    }
}
