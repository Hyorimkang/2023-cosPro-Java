package week4;

public class Solution12 {
	public int func_a(int[] arr) {
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%5==0) count+=1;
		}
		
		return count;
	}//func_a
	
	public String func_b(int three, int five) {
		if(three>five) {
			return "three";
		}
		else if(three<five) {
			return "five";
		}
		else{
			return "same";
		}
	}//func_b
	
	public int func_c(int[] arr) {
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%3==0) count+=1;
		}
		return count;
	}//func_c

	public String solution(int[] arr) {
		int countThree = func_c(arr);
		int countFive = func_a(arr);
		String answer = func_b(countThree, countFive);
		
		return answer;
	}//solution
	
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] arr = {2,3,6,9,12,15,10,20,22,25};
		String ret = sol.solution(arr);
		
		System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");

	}
}
