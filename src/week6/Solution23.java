package week6;

public class Solution23 {

    public int solution(int[] scores) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int temp=0,cnt=0,sum = 0;
        for(int i = 0; i<scores.length; i++) {
        	for(int j = 0; j<scores.length; j++) {
        		if(scores[i]>scores[j]) {
        			temp = scores[i];
        			scores[i] = scores[j];
        			scores[j] = temp; 
        		}
        	}
        	cnt++;
        }
        for(int i = 1; i<scores.length-1; i++){
        	 sum += scores[i];
        }
        answer = sum/(cnt-2);
        
        return answer;
    }
    
    public static void main(String[] args) {
        Solution23 sol = new Solution23();
        int[] scores1 = {35, 28, 98, 34, 20, 50, 85, 74, 71, 7};
        int ret1 = sol.solution(scores1);
       
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int[] scores2 = {1, 1, 1, 1, 1};
        int ret2 = sol.solution(scores2);
        
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
