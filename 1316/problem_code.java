import java.util.Scanner;

public class problem_code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String word =in.nextLine();

            if (groupWord(word)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean groupWord(String word) {
        boolean[] checked = new boolean[26];

        int prev = -1;

        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (prev != idx) {
                if (checked[idx]) {
                    return false;
                }
                checked[idx] = true;
                prew = idx;
            }
        }
        return true;
    }
}
