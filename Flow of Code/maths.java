import java.util.Scanner;

public class maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number1 : ");
         int num1 = sc.nextInt();
        System.out.print("Enter a Number2 : ");
         int num2 = sc.nextInt();

         int  a = num1 ;
         int  b = num2 ;

         //HCF
         while (b!=0) {
            int temp = b ;
            b = a%b;
            a = temp ;
            
         }
        
         int hcf = a ;
          System.out.println("The value of HCF(GCD) : " + hcf);; 
          
         //LCM
          int lcm = (num1 * num2)/hcf ;
         System.out.println("The value of LCM : " + lcm);

         sc.close();
    }
    
}
