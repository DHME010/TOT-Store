
import java.util.*;

public class TheBuyer {
    public static Scanner input = new Scanner(System.in);

    public static int g ;
    public static void productsToBuy(){
        System.out.println("Enter the number of the ptoduct you will buy : ");
        int x = input.nextInt();
        boolean c = true ;
    while ( c ){
        if(x==1){
            g = 2500 ;
            String d1 = "PS5";
            System.out.println("You will pay for the PS5");
            System.out.println("Paypal  ( 1 ) ");
            System.out.println("Cash  ( 2 )");
            System.out.println("Enter the number you will pay : ");
            int howToPay = input.nextInt();
            if (howToPay==1){
                System.out.println("Paypal : 297412473285321");
            }else{
                System.out.println("You will pay cash");
            }
        }
        if(x==2){
            g = 5599 ;
            String d2 = "iPhone 14";
            System.out.println("You will pay for the New Apple iPhone 14");
            System.out.println("Paypal  ( 1 ) ");
            System.out.println("Cash  ( 2 )");
            System.out.println("Enter the number you will pay : ");
            int howToPay = input.nextInt();
            if (howToPay==1){
                System.out.println("Paypal : 297412473285321");
            }else{
                System.out.println("You will pay cash");
            }
        }
        if(x==3){
            g = 4799 ;
            String d3 = "Gaming Notebook";
            System.out.println("You will pay for the Acer Nitro 5 An515 Gaming Notebook");
            System.out.println("Paypal  ( 1 ) ");
            System.out.println("Cash  ( 2 )");
            System.out.println("Enter the number you will pay : ");
            int howToPay = input.nextInt();
            if (howToPay==1){
                System.out.println("Paypal : 297412473285321");
            }else{
                System.out.println("You will pay cash");
            }
        }
        if(x==4){
            g = 6603 ;
            String d4 = "PC" ;

            System.out.println("You will pay for the Skytech Chronos Gaming PC Desktop");
            System.out.println("Paypal  ( 1 ) ");
            System.out.println("Cash  ( 2 )");
            System.out.println("Enter the number you will pay : ");
            int howToPay = input.nextInt();
            if (howToPay==1){
                System.out.println("Paypal : 297412473285321");
            }else{
                System.out.println("You will pay cash");
            }
        }
        System.out.println("You want to pay more ?");
        System.out.println("enter no to exit :  ");
        String n = input.next();

        if(n.equalsIgnoreCase("no")){
            c = false;
        }
    }
    }
    public static void NameNaumberAdres(){
        System.out.println("Enter your name : ");
        String nameBuyer = input.nextLine();
        nameBuyer = input.nextLine();
        System.out.println("Enter your number : ");
        int naumberBuyer = input.nextInt();
        System.out.println("Enter your adres : ");
        String adresBuyer = input.nextLine();
        adresBuyer = input.nextLine();
    }
    public static void timeToTake(){
        System.out.println("The order will reach you within two weeks");
    }
}