import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the table : ");
        int table = sc.nextInt();

        System.out.print("Enter the limit :");
        int limit = sc.nextInt();
        
        System.out.println("Multiplication Table of " + table + " :");
        for (int i = 1; i <= limit; i++) {
            System.out.println(table + " X " + i + " = " +(table * i));
            sc.close();
           
        }
    }
}
