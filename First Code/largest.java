import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number1 :");
        double num1 = sc.nextDouble();

        System.out.print("Enter Number2 :");
        double num2 = sc.nextDouble();

        double lar = Math.max(num1, num2);
        int output = (int) lar ;
        System.out.println("Largest Number of " + num1 + " & " + num2 + " is " + output);
        sc.close();
    }
}
