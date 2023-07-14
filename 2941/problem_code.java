import java.util.Scanner;

public class problem_code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String word = in.nextLine();
        in.close();

        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String a : alphabet) {
            word = word.replace(alphabet, "");
        }

        System.out.println(word.length());
    }
}
