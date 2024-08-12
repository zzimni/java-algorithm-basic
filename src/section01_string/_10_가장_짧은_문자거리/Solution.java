package section01_string._10_가장_짧은_문자거리;

import java.util.Scanner;

public class Solution {

    public int[] solution(String s, char t) {
        // 배열에서 왼->오, 왼<-오 로 각각 조회하면서 해당 문자가 나오면 0을 저장하고 그 뒤는 1,2,3.. 을 저장
        // 둘 중에 더 작은 수 가질 때의 값을 저장하게끔 한다
        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t) {
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i = s.length()-1; i>=0; i--) {
            if(s.charAt(i) == t) {
                p=0;
            }
            else{
                p++;
                answer[i]=Math.min(answer[i],p); // 값들 중 최솟값을 반환하는 메서드
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x : T.solution(str,c)){
            System.out.print(x+" ");
        }

    }
}
