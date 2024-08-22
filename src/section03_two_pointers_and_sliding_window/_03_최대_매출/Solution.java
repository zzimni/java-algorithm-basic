package section03_two_pointers_and_sliding_window._03_최대_매출;

import java.util.*;

// Sliding Window
public class Solution {
    public int solution(int n, int k, int[] arr){
        int answer, sum=0;
        // 배열 첫번째 인덱 부터 k개 합한 걸로 sum을 초기화
        for(int i=0; i<k; i++) sum+=arr[i];
        answer = sum;
        for(int i=k; i<n; i++){
            sum+=(arr[i]-arr[i-k]); // 맨 왼쪽이랑 맨 오른쪽 한 칸씩 우측으로 옮기는 과정 -> sliding window
            answer=Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}