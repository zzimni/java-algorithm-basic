package section02_array._12_멘토링;

import java.util.Scanner;

/*
4중 for문 써야하는 문제
순서쌍을 먼저 만들어놓고 그 쌍이 멘티-멘토 조건을 만족하는지 확인
만족 안하면 카운팅 안하고 for문 break

입력이 다음과 같을 때
4 (학생 수) 3 (수학 시험 횟수)
3 4 1 2
4 3 2 1
3 1 4 2

for i = 1~4 : 멘티 학생 번호
    for j = 1~4 : 멘토 학생 번호
        (i,j)에 대해서

        for k = 0~2 : 시험 회차
            for s = 0~3 : 등수

                if(arr[k][s]==i)
                    pi=s; (position i - i의 등수)
                if(arr[k][s]==j)
                    pj=s; (position j - j의 등수)

                if(pi<pj)
                    cnt++;
        if(cnt == 3) : 시험 회차만큼 카운팅 됐을 때 - 멘토-멘티 조건이 충족됐을 때
            answer++;

*/
public class Solution {
    public int solution(int n, int m, int[][] arr){
        int answer=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt=0;
                for(int k=0; k<m; k++){
                    int pi=0, pj=0;
                    for(int s=0; s<n; s++){
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m){
                    answer++;
                    //System.out.println(i+" "+j);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, m, arr));
    }
}