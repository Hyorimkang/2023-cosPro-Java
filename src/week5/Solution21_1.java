package week5;

import java.util.Arrays;

public class Solution21_1 {
	public int[] solution(int[] scores) {
		int rank[] = new int[4];
		
		for(int i = 0; i<scores.length; i++) {
			rank[i] = 1;
		}
		for(int i = 0; i<scores.length; i++) {
			for(int j = 0; j<scores.length; j++) {
				if(scores[i]<scores[j]) {
					rank[i]++;
				}
			}
		}
		return rank;
	}

	public static void main(String[] args) {
	Solution21_1 sol = new Solution21_1();

	int[] scores = {20, 60, 98, 59};
	int[] ret = sol.solution(scores);

	System.out.println("점수" + Arrays.toString(scores));
	System.out.println("석차" + Arrays.toString(ret)); 

	}
}
