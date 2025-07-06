import java.util.Scanner;

public class simple_interset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle (p): ");
        double p = sc.nextDouble();

        System.out.print("Enter Time (T in Years): ");
        double t = sc.nextDouble();

        System.out.print("Enter Rate (R per annum): ");
        double r = sc.nextDouble();

        double interest = (p * t * r) / 100;
        System.out.println("Simple Interset = " + interest);
        sc.close();
    }
}
