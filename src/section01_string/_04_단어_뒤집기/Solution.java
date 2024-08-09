package section01_string._04_단어_뒤집기;

import java.util.*;

// 직접 뒤집기 방식 (배열)
public class Solution {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] s = x.toCharArray(); // 문자열을 캐릭터 배열로 바꾸는 내장함수 : toCharArray()
            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // 문자 배열을 String화 하는 String의 'static' method여서 항상 String.valueOf(arr) 형식으로 써야함
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
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