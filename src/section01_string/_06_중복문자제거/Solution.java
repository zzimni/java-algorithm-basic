package section01_string._06_중복문자제거;

import java.util.Scanner;

public class Solution {
    public String solution(String str) {
        String answer=""; // 입력받은 문자열을 조건에 맞게 수정한 버전 : 빈 문자열을 생성하고 거기에 char 를 하나씩 덧붙이는 방식
        for(int i=0;i<str.length();i++){
//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i))); // str.indexOf(str.charAt(i)) : i번째 글자가 발견되는 "가장 첫번째 위치"를 반환(한다는 점을 이용하자!)
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
