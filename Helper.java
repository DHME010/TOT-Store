
import java.util.*;

public class Helper {

    public static void deliveryCharge (){
        Scanner input = new Scanner(System.in);
        System.out.println("If you live in Macca no Delivery Charge you will pay ");
        System.out.println("Your live in Macca ? ");
        String x = input.nextLine();
        if(x.equalsIgnoreCase("yes")){
            System.out.println("No Delivery Charge : "+TheBuyer.g);
        }else{
            System.out.println("After Delivery Charge : "+TheBuyer.g * 1.05);
        }
    }
}
