package section02_array._01_큰_수_출력하기;

import java.util.ArrayList;
import java.util.Scanner;

/*
설명)
N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
(첫 번째 수는 무조건 출력한다)

입력)
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

출력)
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
*/
public class MyAnswer {
    public ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[i-1]){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        MyAnswer T = new MyAnswer();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            inputArray[i]=a;
        }
        for(int x:T.solution(inputArray)){
            System.out.print(x+" ");
        };
    }
}
