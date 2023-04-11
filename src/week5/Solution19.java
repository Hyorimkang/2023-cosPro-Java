package week5;


public class Solution19 {
	public int solution(int[] votes, int N, int K) {
        int[] counter = new int[N+1];
        for(int i = 0; i < votes.length; ++i) {
        	counter[votes[i]] += 1;
        }

        int answer = 0;
        for(int i = 0; i < counter.length; ++i) {
            if(counter[i]==K) {
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution19 sol = new Solution19();
        int[] votes = {2, 5, 3, 4, 1, 5, 1, 5, 5, 3};
        int N = 5;
        int K = 2;
        int ret = sol.solution(votes, N, K);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}


