package section02_array._06_뒤집은_소수;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    // 소수인지 판별하는 알고리즘 -> 이렇게 함수 따로 빼서 쓰는 게 가독성 좋음
    public boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2;i<num;i++){
            if(num%i==0) return false;
        }
        return true;
    }

    // 숫자 뒤집는 알고리즘
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp=arr[i]; // tmp = 123 일 때
            int res = 0;
            while(tmp > 0){
                int t = tmp % 10; // t = 123 % 10 = 3 : tmp의 1의자리 숫자
                res = res * 10 + t; // res = 0 * 10 + 3 : 1의자리 숫자부터 앞쪽에 붙여넣기 시작
                tmp = tmp / 10; // tmp = 123 / 10 = 12 : 1의자리부터 잘라내기
            }
            if(isPrime(res)){
                answer.add(res);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x: T.solution(n, arr)){
            System.out.println(x+" ");
        }
    }
}
