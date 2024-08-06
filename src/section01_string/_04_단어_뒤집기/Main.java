package section01_string._04_단어_뒤집기;

import java.util.Scanner;
/*
4. 단어 뒤집기
설명)
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

입력)
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

출력)
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
*/
public class Main {

    public void solution(int n, Scanner kb) { // Scanner kb를 main에서 전달 받아야 runtime error가 안 남 -> 이유 알아오기
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            String str = kb.nextLine();
            arr[i] = str;
        }
        for(int i = 0; i < n; i++) {
            char[] charArray = arr[i].toCharArray();
            StringBuffer sb = new StringBuffer();
            for(int j = charArray.length-1; j >= 0; j--) {
                sb.append(charArray[j]);
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.nextLine();
        T.solution(n, kb);
        kb.close();
    }
}
