package section01_string._10_가장_짧은_문자거리;

import java.util.Scanner;

/*
10. 가장 짧은 문자거리
설명)
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

입력)
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.

출력)
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
*/
public class MyAnswer {
    public void solution(String str, char c) {
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] == c) {
                charArr[i]=0;
            }
        }
    }

    public static void main(String[] args) {
        MyAnswer T = new MyAnswer();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        T.solution(str,c);

    }
}
