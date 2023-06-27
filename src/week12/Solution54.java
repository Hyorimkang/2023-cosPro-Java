package week12;

public class Solution54 {
	public int solution(String[][] cards) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int count[] = new int[3];
        
        for(int i = 0; i<cards.length; i++) {
        	if(cards[i][0].equals("black")) {
        		count[0]++;
        	}
        	else if(cards[i][0].equals("blue")) {
        		count[1]++;
        	}
        	else {
        		count[2]++;
        	}
        	answer += Integer.parseInt(cards[i][1]);
        }
        
        for(int i = 0; i<count.length; i++) {
        	if(count[i]==3) answer *= 3;
        	else if(count[i]==2) answer *= 2;
        }
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution54 sol = new Solution54();
        String[][] cards1 = {{new String("blue"), new String("2")}, {new String("red"), new String("5")}, {new String("black"), new String("3")}};
        int ret1 = sol.solution(cards1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[][] cards2 = {{new String("blue"), new String("2")}, {new String("blue"), new String("5")}, {new String("black"), new String("3")}};
        int ret2 = sol.solution(cards2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
