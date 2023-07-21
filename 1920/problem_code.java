import java.util.Scanner;

public class problem_code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] num = new int[m];
        for (int i = 0; i < m; i++) {
            num[i] = in.nextInt();
        }

        for (int x : num) {
            boolean e = false;
            for (int anum : a) {
                if (anum == x) {
                    e = true;
                    break;
                }
            }
        }

        if (e) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
