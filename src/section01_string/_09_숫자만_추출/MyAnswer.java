package section01_string._09_숫자만_추출;

import java.util.Scanner;

/*
9. 숫자만 추출

설명)
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


입력)
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.


출력)
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
*/
public class MyAnswer {
    public int solution(String str) {
        char[] arr = str.toCharArray();
        String newstr = "";
        for (char c : arr) {
            if (Character.isDigit(c)) {
                // 문자c가 정수(0~9)인지 확인하는 메서드
                newstr += c;
            }
        }
        // 내가 원래 쓴 방식 (return 타입을 String으로 해야함)
//        while(newstr.startsWith("0")){
//            newstr = newstr.substring(1); // substring(n,m)은 n부터 m-1까지 뽑아오는 건데 m을 안 쓰면 마지막까지 쭉 뽑아옴
//        }
//
//        return newstr;

        // 더 쉬운 방식 (return 타입을 int으로 해야함)
        return Integer.parseInt(newstr);
        // Integer.parseInt(String 변수) : 변수를 String에서 Integer로 형변환

    }

    public static void main(String[] args) {
        MyAnswer T = new MyAnswer();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}
