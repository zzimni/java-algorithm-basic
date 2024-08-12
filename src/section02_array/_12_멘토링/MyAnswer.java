package section02_array._12_멘토링;

import java.util.Scanner;

public class MyAnswer {
    public int solution(int m, int n, int[][] arr) {
        return 0;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        kb.nextLine();
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j]=kb.nextInt();
            }
        }
    }
}
