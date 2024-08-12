package section01_string._12_암호;

import java.util.Scanner;

public class Solution {

    public String solution(int n, String s){
        String answer="";
        for(int i=0;i<n;i++){
            String tmp=s.substring(0,7).replace('#','1').replace('*','0'); // 특정 문자를 다른 문자로 변경할 때는 replace 메서드를 써서 간단히 변경 가능
            int num = Integer.parseInt(tmp,2); // 문자를 이진수로 변경한다는 것
//            System.out.println(tmp+" "+num);
            answer+=(char) num;
            s=s.substring(7);
            // 7번째 자리부터 끝까지 잘라내고 거기서 맨 앞 7자리씩 계속 뽑아내는 것
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n,str));

    }
}
