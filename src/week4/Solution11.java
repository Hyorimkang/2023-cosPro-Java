package week4;

public class Solution11 {
	final int max_product_number = 10;
	
	public int[] func_a(int[] arr) {
		int[] counter = new int[max_product_number+1];
		for(int i = 0; i<arr.length; i++) {
			counter[arr[i]] += 1; //arr[i]의 값의 방에 1증가
		}
		
		return counter;
	}//func_a
	
	public int solution(int[] left_gloves, int[] right_gloves) {
		int[] left_counter = func_a(left_gloves);
		int[] right_counter = func_a(right_gloves);
		int total = 0;
		for(int i = 1; i< max_product_number; i++) {
			total += Math.min(left_counter[i], right_counter[i]);
		}
		return total;
	}

	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		int[] leftGloves = {2,1,2,2,4};
		int[] rightGloves = {1,2,2,4,4,7};
		int ret = sol.solution(leftGloves, leftGloves);
		
		System.out.println("solution 메소드의 반환값은 " + ret + "입니다.");

	}
}
