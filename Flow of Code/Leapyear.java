import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.print("Enter a Year : ");
        Scanner sc = new  Scanner(System.in);
        int yrs = sc.nextInt();
        check(yrs);
        sc.close();
    }

    static void check(int year){
       if(year >=1000 && year <= 9999){
              if(year%4 == 0 && year%100 != 0 || year%400 == 0){
            System.out.println(year +" is Leap Year");
        }else{
            System.out.println(year + " is Not a Leap Year");
        }
       }else{
        System.out.println(" Erro ! Enter a Four digit Year");
       }
       
       
      
          
    }
}
