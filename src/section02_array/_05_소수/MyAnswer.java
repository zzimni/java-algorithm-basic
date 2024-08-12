package section02_array._05_소수;

import java.util.Scanner;

/*
5. 소수(에라토스테네스 체) ! 내 풀이는 time limit exceeded 뜸!

설명)
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

입력)
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다. // 이렇게 input의 숫자 limit이 클 때는 time limit을 고려해서 풀어야함!!

출력)
첫 줄에 소수의 개수를 출력합니다.
*/
public class MyAnswer {
    public int solution(int n){
        if(n==2){
            return 1;
        }
        int cnt = 1;
        for(int i = 3; i < n; i++){
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    break;
                }
                if(j==i-1){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        MyAnswer T = new MyAnswer();
        System.out.println(T.solution(n));
    }
}
