import java.util.*;

public class D2Array {
    private int n, m;
    private int[][] arr;

    public void InSize(int n, int m) {
        this.n = n;
        this.m = m;
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = 0;
            }
        }
    }

    public void SetArray(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public void out() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + ((j == m - 1) ? "" : " "));
            }
            System.out.print("\n");
        }
    }
}
