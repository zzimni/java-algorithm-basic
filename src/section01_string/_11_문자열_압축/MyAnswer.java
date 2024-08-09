package section01_string._11_문자열_압축;

import java.util.Scanner;

/*
11. 문자열 압축 // 너무 여러번 실행해보고 답에 짜맞춰가면서 풂
설명)
알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
단 반복횟수가 1인 경우 생략합니다.

입력)
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력)
첫 줄에 압축된 문자열을 출력한다.
*/
public class MyAnswer {
    public String solution(String str){
        char[] arr = str.toCharArray();
        String answer=String.valueOf(arr[0]);
        char tmp = arr[0];
        int cnt=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==tmp){
                cnt++;
                if(i==arr.length-1){
                    if(cnt!=1){
                        answer+=String.valueOf(cnt);
                    }
                }
            }
            else{
                if(cnt!=1) answer+=String.valueOf(cnt);
                tmp=arr[i];
                answer+=tmp;
                cnt=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MyAnswer T = new MyAnswer();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));

    }
}
