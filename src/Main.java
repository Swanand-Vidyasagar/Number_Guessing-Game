import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GetNum obj = new GetNum();

        while (true) {
            System.out.println("Guess the number from 0 - 100: ");
            int N;

            while (true) {
                N = input.nextInt();
                if (N > 100 || N < 0) {
                    System.out.println("⚠️ Enter a valid number (0-100) !!");
                } else {
                    break;
                }
            }


            if (obj.checkNum(N)) {
                System.out.println("✅ You won! Game Over.");
                break;
            }
        }

        input.close();
    }
}
