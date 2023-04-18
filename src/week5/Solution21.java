package week5;

import java.util.Arrays;

public class Solution21 {

    int func_a(int[] scores, int score){
        int length = scores.length;
        for(int rank = 0; rank < length; rank++)
            if(scores[rank] == score)
                return rank + 1;
        return 0;
    }
    
    void func_b(int[] arr){
        Arrays.sort(arr); //오름차순 정렬
        int length = arr.length;
        int temp = 0;
        for(int i = 0; i < length / 2; i++){
            temp = arr[i];
            arr[i] = arr[(length - 1) - i];
            arr[(length - 1) - i] = temp;
        }
    }
    
    int func_c(int[] arr, int n){
        return arr[n-1];
    }
    public int solution(int[] scores, int n) {
        int score = func_a(scores, n);
        func_b(scores);
        int answer = func_c(scores ,n);
        return answer;
    }
    
    public static void main(String[] args) {
        Solution21 sol = new Solution21();
        int[] scores = {20, 60, 98, 59};
        int n = 3;
        int ret = sol.solution(scores, n);


        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
