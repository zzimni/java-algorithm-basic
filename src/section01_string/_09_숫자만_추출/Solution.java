package section01_string._09_숫자만_추출;

import java.util.Scanner;

// 아스키코드 이용하는 방법
public class Solution {
    public int solution(String str) {
        int answer = 0;
        for(char x : str.toCharArray()) { // char형은 원래 정수값임(아스키코드)
            if(x>=48 && x<=57) answer=answer*10+(x-48); // 0~9의 아스키코드는 48~57이므로 48씩 빼줘야 실제 10진수 값이 나옴
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
