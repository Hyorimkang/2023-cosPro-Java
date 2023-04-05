package week2;

public class Solution6 {
	public int solution(int number) {
		int count = 0;
		for(int i = 1; i<=number; i++) {
			int current = i;
			
			//3,6,9가 중복일때 
			while(current != 0) {
				if(current%10==3 || current%10==6 || current%10==9) {
					count++;
					System.out.print("pair");
				}
				current/=10;
			}
			
			System.out.print(" ");
		}
		System.out.println();
		return count;
	}
	
	
	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		int number = 40;
		int ret = sol.solution(number);
		
		System.out.println("Solution: return value of the method is " + ret + ".");

	}

}
