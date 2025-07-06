import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter a Number1 : ");
        int num2 = sc.nextInt();

        System.out.print("Enter the operation(+,-,*,/) : ");
        char op = sc.next().charAt(0);

        if (op == '+') {
           int add = num1 + num2 ;
            System.out.println("Addition of " + num1 +" & "+ num2 + " is " + add);
        }

        if (op == '-') {
           int sub = num1 - num2 ;
            System.out.println("Subtraction of " + num1 +" & "+ num2 + " is " + sub);
        }
         
        if (op == '*') {
           int mul = num1 * num2 ;
            System.out.println("Multiplication of " + num1 +" & "+ num2 + " is " + mul);
        }

        if (op == '/') {
           int div = num1 / num2 ;
            System.out.println("Division of " + num1 +" & "+ num2 + " is " + div);
        }
        sc.close();
    }
}
