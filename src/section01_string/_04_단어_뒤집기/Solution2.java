package section01_string._04_단어_뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

// StringBuilder(의 reverse 내장함수) 이용법
public class Solution2 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            // StringBuilder와 StringBuffer는 String과 달리 객체를 계속 생성하지 않음
            // 이들의 내장함수 중에 reverse가 있음
            // 다시 String으로 타입 변환 해서 저장해줘야함
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        Solution2 T = new Solution2();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String[] str=new String[n];
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}