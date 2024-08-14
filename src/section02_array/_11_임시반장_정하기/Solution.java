package section02_array._11_임시반장_정하기;

import java.util.Scanner;

public class Solution {

    public int solution(int n, int[][] arr){
        int answer=0, max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int cnt=0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        // 인덱스 번호랑 안 헷갈리게 배열의 0번째 부분은 비워두고 1부터 채움
        int[][] arr = new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n,arr));
    }
}
