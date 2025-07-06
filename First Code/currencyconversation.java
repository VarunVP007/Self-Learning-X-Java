import java.util.Scanner;

public class currencyconversation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in Indian Rupees(INR)");
        double inr = sc.nextDouble();
          
        double conversationrate = 82.3 ;
        double usd = inr / conversationrate;
        
        // Format specifier %-format_specifier starts , 2 - indicate digit after decimal point , f - floating point 
        System.out.printf("Equivalent amount in USD : $%.2f\n" , usd);
        sc.close();
    }
}
