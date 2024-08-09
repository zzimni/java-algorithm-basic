package section01_string._06_중복문자제거;

import java.util.Scanner;

/*
6. 중복문자제거 ! 못 푼 문제 !
설명)
소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

입력)
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.

출력)
첫 줄에 중복문자가 제거된 문자열을 출력합니다.
*/
public class MyAnswer {
    public String solution(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    arr[j]='\0';
                }
            }
        }
        String answer=String.valueOf(arr);
        // 계속 arr.toString 이라고 쓰는데 toString은 StringBuffer나 StringBuilder를 String으로 변환할 때 자주 쓰는 거고
        // char 배열을 String으로 변환할 땐 String.valueOf(char배열명) 이렇게 써야함!!
        return answer;
    }

    public static void main(String[] args) {
        MyAnswer T = new MyAnswer();
        Scanner kb =  new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    /*
    입력) ksekkset
    출력) kse    t
    => char 배열을 String으로 바꾸었더니 공백 처리한 부분도 이상한 문자로 출력됨
    */

}
