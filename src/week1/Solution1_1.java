package week1;

public class Solution1_1 {
public int[] solution(String[] shirtSize, String[] bestIdol, int[] size_counter) {
		
		for(int i =0; i<shirtSize.length; i++) {
			if(shirtSize[i].equals(bestIdol[0])) {
				size_counter[0]++;
			}
			else if(shirtSize[i].equals(bestIdol[1])) {
				size_counter[1]++;
			}
			else if(shirtSize[i].equals(bestIdol[2])) {
				size_counter[2]++;
			}
			else if(shirtSize[i].equals(bestIdol[3])) {
				size_counter[3]++;
			}
			else if(shirtSize[i].equals(bestIdol[4])) {
				size_counter[4]++;
			}
			else if(shirtSize[i].equals(bestIdol[5])) {
				size_counter[5]++;
			}
			
		}
		return size_counter;
	}
	
	public int[] max(int[] size_counter) {
		int max[] = new int[1];
		for(int i =0; i<5; i++) {
			if(size_counter[i]>max[0]) {
				max[0] = size_counter[i];
			}
		}
		return max;
	}
}
