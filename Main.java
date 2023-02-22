
import java.util.*;

public class Main {

    public static int k ;
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("You want to sale ? Yes ( 1 ) , No ( 2 ) ");
        k = input.nextInt();
        
        if (k == 1){
            TheSeller.Shop();
        }else{
            TheGoods.dispalyProducts();
            TheBuyer.productsToBuy();
            TheBuyer.NameNaumberAdres();
            TheBuyer.timeToTake();
            Helper.deliveryCharge();
        }
    }
}