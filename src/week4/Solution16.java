package week4;

public class Solution16 {

	//방법 1
//	 public int solution(int[] floors) {
//		 int dist = 0;
//	     int length = floors.length;
//	     for(int i = 1; i<length; ++i){
//	        if(floors[i]>floors[i-1]) {
//	        	dist += floors[i] - floors[i-1];
//	        }
//	        else {
//	         	dist += floors[i-1] - floors[i];
//	        }
//	   	 }
//	        return dist;
//	}
	
	//방법 2
	public int solution(int[] floors) {
		 int dist = 0;
	     int length = floors.length;
	     for(int i = 1; i<length; ++i){
	    	 dist+= java.lang.Math.abs(floors[i] - floors[i-1]);
	   	 }
	        return dist;
	}

	public static void main(String[] args) {
		Solution16 sol = new Solution16();
	    int[] floors = {1, 2, 5, 4, 2};
	    int ret = sol.solution(floors);
	    
	    System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}

}
