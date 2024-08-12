package section01_string._05_특정_문자_뒤집기;

import java.util.Scanner;

/*
5. 특정 문자 뒤집기

설명)
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

입력)
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

출력)
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

*/

public class MyAnswer {
    public String solution(String word) {
        char[] arr = word.toCharArray();
        int lt=0, rt=arr.length-1;
        while(rt>lt){
            if (!Character.isAlphabetic(arr[lt])) { // isAlphabetic : 해당 글자가 알파벳인지 확인하는 Character의 static method
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
                // 이 과정 빠지면 안됨 !!
            } else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        String str = String.valueOf(arr);
        return str;
    }

    public static void main(String[] args) {
        MyAnswer T = new MyAnswer();
        Scanner kb = new Scanner(System.in);
        String word = kb.nextLine();
        System.out.println(T.solution(word));

    }
}
