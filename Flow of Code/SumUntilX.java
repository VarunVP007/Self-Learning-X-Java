import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (type 'x' to stop):");

        while (true) {
            String input = sc.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x'.");
            }
        }

        System.out.println("Total sum = " + sum);
        sc.close();
    }
}
