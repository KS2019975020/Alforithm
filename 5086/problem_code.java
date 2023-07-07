public class problem_code {
    public static void main(string[] args) {
        int a = 4, b = 3;
        
        if(b % a == 0) {
            System.out.println("factor");
        } else if(a % b == 0) {
            System.out.println("multiple");
        } else {
            System.out.println("neither");
        }
    }
}