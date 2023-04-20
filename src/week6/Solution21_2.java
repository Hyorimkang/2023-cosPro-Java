package week6;

import java.util.Arrays;

public class Solution21_2 {
	 public int[] solution(int[] scores) {
	        int scores_length = scores.length;
	        int temp;
	        for(int i =0; i<scores_length-1; i++) {
	        	for(int j =i+1; j<scores_length; j++) {
	        		if(scores[i]>scores[j]) {
	        			temp = scores[i];
	        			scores[i] = scores[j];
	        			scores[j] = temp;
	        		}
	        	}
	        }
	        return scores;
	    }
	    
	    public static void main(String[] args) {
	        Solution21_2 sol = new Solution21_2();
	        int[] scores = {20, 60, 98, 59};
	        System.out.println("점수 : " + Arrays.toString(scores));
	        int[] ret = sol.solution(scores);
	        System.out.println("정렬 : " + Arrays.toString(ret));
	    }
}
