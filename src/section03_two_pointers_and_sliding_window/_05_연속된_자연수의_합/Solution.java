package section03_two_pointers_and_sliding_window._05_연속된_자연수의_합;

import java.util.Scanner;

// 수학적 방식
/*
ex) 15를 세 개의 연속된 숫자로 나누어보자
일단 1, 2, 3 이렇게 두고
15 - (1 + 2 + 3) / 3 = 3 이므로 1, 2, 3 에 3씩 더하면
4 + 5 + 6 = 15가 된다
이렇게 나누어지는 숫자의 개수(cnt)를 늘려가보며 체크해보자
*/
public class Solution {
    public int solution(int n){
        int answer=0, cnt=1;
        n--;
        while(n>0){
            cnt++;
            n=n-cnt;
            if(n%cnt==0) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(T.solution(n));
    }
}