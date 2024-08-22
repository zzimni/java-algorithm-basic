package section03_two_pointers_and_sliding_window._04_연속부분수열;

import java.util.Scanner;

// two pointer 와 sliding window는 결국 O(n^2)의 시간복잡도를 O(n)으로 바꾸게 하려는 알고리즘
public class Solution {
    public int solution(int n, int m, int[] arr){
        int answer=0, sum=0, lt=0;
        for(int rt=0; rt<n; rt++){ // lt부터 rt까지의 합을 구할 것
            sum+=arr[rt];
            if(sum==m) answer++;
            while(sum>=m){ // sum 이 m값이거나 넘겼을 때 왼쪽부터 원소 값을 하나씩 빼나가 보자
                sum-=arr[lt++];
                if(sum==m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}