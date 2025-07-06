import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print(" Enter the Range : ");
       int num = sc.nextInt();

       int first = 0 , second = 1 ;
       System.out.println("Fibonacci Series : ");

         for (int i = 0; i < num; i++) {
            System.out.println(first + "");

                     int next = first + second ;
                     first = second ;
                     second = next;
            
         }

      sc.close();
    }
}
