import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the chemical values.
        Scanner scanner = new Scanner(System.in);

        // Stores chemical X.
        int X = scanner.nextInt();

        // Stores chemical Y.
        int Y = scanner.nextInt();

        // Checks if the person is telling the truth.
        if (X + Y > 30) {
            System.out.println("The person is telling the truth");
        } else {
            System.out.println("The person is lying");
        }
    }
}