package section03_two_pointers_and_sliding_window._02_공통원소_구하기;

import java.util.*;
public class Solution {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a); // 배열 오름차순 정렬
        Arrays.sort(b);
        // 두 배열을 일단 오름차순 정렬 해놓고 인덱스 0부터 비교한 다음에 둘 중 값이 작은 쪽 인덱스를 +1
        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(a[p1]==b[p2]){
                answer.add(a[p1++]);
                p2++;
            }
            else if(a[p1]<b[p2]) p1++;
            else p2++;
        }
        // 내 답안은 미리 정렬을 안해놓고 모두 비교를 해버려서 연산 횟수가 너무 많았음!
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        int m=kb.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=kb.nextInt();
        }
        for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");
    }
}