package section02_array._09_격자판_최대합;

import java.util.Scanner;

public class MyAnswer {
    public int solution(int n, int[][] arr) {
        int max=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }
        for (int i = 0; i < n; i++){
            sum += arr[i][i];
        }
        if (sum > max) {
            max = sum;
        }
        sum=0;
        for (int i = n-1; i >=n; i--){
            sum += arr[i][i];
        }
        if (sum > max) {
            max = sum;
        }
        sum=0;
        return max;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
            kb.nextLine();
        }
        MyAnswer T = new MyAnswer();
        System.out.println(T.solution(n,arr));

    }
}
