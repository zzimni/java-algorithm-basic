package section01_string._11_문자열_압축;

import java.util.Scanner;

public class Solution {
    public String solution(String s) {
        String answer="";
        s=s+" ";
        int cnt=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){ // 수정 없이 새로운 글자 덧붙이기만 하는 거면 굳이 char 배열 쓰지 말고 String에서 charAt만 활용해도 됨
                cnt++;
            }
            else{
                answer+=s.charAt(i);
                if(cnt>1){
                    answer+=String.valueOf(cnt); // 직전까지 글자 반복 횟수가 2 이상일 때만 숫자 붙이기
                    cnt=1;
                }
            }
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
