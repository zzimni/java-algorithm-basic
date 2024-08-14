package section03_two_pointers_and_sliding_window._01_두_배열_합치기;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. 두 배열 합치기 ! 지피티 살짝 참고함 !
설명)
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

입력)
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

출력)
오름차순으로 정렬된 배열을 출력합니다.
*/
public class MyAnswer {
    public ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            answer.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            boolean inserted = false; // 두번째 배열에 있는 값이 리스트에 있는 모든 값보다 클 때 삽입이 안 되는 경우를 방지하기 위해 원소가 삽입 됐는지 확인하는 플래그 사용
            for (int j = 0; j < answer.size(); j++) {
                if (arr2[i] <= answer.get(j)) {
                    answer.add(j, arr2[i]);
                    inserted = true;
                    break;
                }
            }
            if (!inserted) {
                answer.add(arr2[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MyAnswer T = new MyAnswer();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }
        for (int x : T.solution(arr1, arr2)) {
            System.out.print(x + " ");
        }
    }

}
