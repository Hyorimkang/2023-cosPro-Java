package week11;

public class Solution42 {
	public int func_a(int[] timeTable) {
        int answer = 0;
        for(int i = timeTable.length-1; i >= 0; i--) {
            if(timeTable[i] == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int func_b(int[] timeTable, int class1, int class2) {
        int answer = 0;
        for(int i = class1; i < class2; i++)
            if(timeTable[i] == 0)
                answer++;
        return answer;
    }

    public int func_c(int[] timeTable) {
        int answer = 0;
        for(int i = 0; i < timeTable.length; i++) {
            if(timeTable[i] == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int solution(int[] timeTable) {
        int answer = 0;
        int firstClass = func_a(timeTable);
        int lastClass = func_c(timeTable);
        answer = func_b(timeTable, lastClass, firstClass);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution42 sol = new Solution42();
    	int[] timeTable = {1, 1, 0, 0, 1, 0, 1, 0, 0, 0};
    	int ret = sol.solution(timeTable);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
