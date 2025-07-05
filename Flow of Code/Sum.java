import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number1 :");
        int num1 = sc.nextInt();
 
        System.out.print("Enter the Number2 :");
        int num2 = sc.nextInt();
 
        int add = num1 + num2 ;
        System.out.println("Sum of the Number : " + add);
        sc.close();

    }
}
