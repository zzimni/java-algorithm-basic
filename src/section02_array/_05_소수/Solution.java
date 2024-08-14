package section02_array._05_소수;

import java.util.Scanner;

/*
에라토스테네스의 체 알고리즘: 소수를 찾는 효율적인 알고리즘. 시간 복잡도는 O(n*log(log n))
알고리즘 설명:
1. 2부터 n까지의 모든 수를 소수 후보로 시작합니다. (모두 0으로 된 배열 준비)
2. 가장 작은 소수인 2부터 시작하여, 그 배수들을 모두 제거합니다.
3. 다음 소수를 찾아서 그 배수들을 제거하는 과정을 반복합니다.
4. 남아있는 수들은 모두 소수입니다.
*/
public class Solution {
    public int solution(int n){
        int answer = 0;
        int[] ch = new int[n + 1];
        for(int i=2; i<=n; i++){ // 여기 i가 소수인지 판별하고자 하는 숫자임
            if(ch[i] == 0){ // 소수인 경우(= 체 배열값이 0인 경우)
                answer++;
                for(int j=i; j<=n; j=j+i){
                    ch[j]=1; // 소수의 배수들(소수가 아닌 애들)을 1로 체크
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Solution T = new Solution();
        System.out.println(T.solution(n));
    }
}
