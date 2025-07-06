import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        System.out.print("Enter Your Name :");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hello Student , " + name);
        sc.close();
    }
}
