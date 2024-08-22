package section03_two_pointers_and_sliding_window._05_연속된_자연수의_합;

import java.util.Scanner;
/*
5. 연속된 자연수의 합 ! 맞긴 하지만 수학적으로 구현하는 방법도 알아보자 !
설명)
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
만약 N=15이면
7+8=15
4+5+6=15
1+2+3+4+5=15
와 같이 총 3가지의 경우가 존재한다.

입력)
첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.

출력)
첫 줄에 총 경우수를 출력합니다.
*/
public class MyAnswer {

    public int solution(int n) {
        int answer = 0;
        if(n%2==1){ // 홀수일 때 -> 홀/짝 구분 안하고 else에 있는 구문만 써도 됨
            for(int i=1;i<n;i++){
                if(n%i==0){
                    answer++;
                }
            }
        }
        else{
            int [] arr=new int[n];
            for(int i=1;i<n/2+1;i++){ // n까지 다 할 필요 없음 절반+1 까지만 하면 됨
                arr[i-1]=i;
            }
            int lt=0, sum=arr[lt];
            for(int rt=1;rt<n;rt++){
                sum+=arr[rt];
                if(sum==n){
                    answer++;
                }
                while(sum>=n){
                    sum-=arr[lt];
                    lt++;
                    if(sum==n){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        MyAnswer T = new MyAnswer();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}