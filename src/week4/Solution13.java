package week4;

public class Solution13 {
	 public int solution(int N, int M) {
		 int total = 0;
		 
		 for(int i = N; i<=M; i++) {
			 if(i%2 == 0) total+=i*i;
		 }
		 
		 return total;
	 }
	 
	 public static void main(String[] args) {
		 Solution13 sol = new Solution13();
	     int N = 4, M = 7;
	     int ret = sol.solution(N, M);

	     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
