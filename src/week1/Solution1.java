package week1;

import java.util.Arrays;

public class Solution1 {
	public int[] solution(String[] shirtSize) {
		//write
		int[] answer = {};
		return answer;
	}

	public static void main(String[] args) {
		Solution1_1 sol = new Solution1_1();
		String[] shirtSize = {"아이브", "아이브", "아이브", "아이들", "트와이스", "아이브"};
		String[] bestIdol = { "르세라핌", "아이브", "프로미스 나인", "레드벨벳", "트와이스", "아이들"};
		int[] size_counter = new int[6];
		int[] ret = sol.solution(shirtSize, bestIdol,size_counter);
		int[] maxium = sol.max(size_counter);
		//Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + ".");
		System.out.println("1등은 " + maxium);
	}
}
