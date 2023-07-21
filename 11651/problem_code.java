import java.util.Scanner;

public class problem_code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] p = new int[n][2];
        for (int i = 0; i < n; i++) {
            p[i][0] = in.nextInt();
            p[i][1] = in.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (p[j][1] > p[j + 1][1] || (p[j][1] == p[j + 1][1] && p[j][0] > p[j + 1][0])) {
                    int tmpx = p[j][0];
                    int tmpy = p[j][1];
                    p[j][0] = p[j + 1][0];
                    p[j][1] = p[j + 1][1];
                    p[j + 1][0] = tmpx;
                    p[j + 1][1] = tmpy;
                }
            }
        }

        for (int[] pp : p) {
            System.out.println(pp[0] + pp[1]);
        }
    }
}
