import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         double discount, dAmount, mPrice, dPrice;
         System.out.println("Enter the price: ");
         Scanner inp = new Scanner(System.in);
         mPrice = inp.nextDouble();
         System.out.println("Enter the discount: ");
         discount = inp.nextDouble();

         dAmount =  mPrice* (discount/100);
         dPrice = mPrice - dAmount;
         System.out.println("The price of the item after discount is " + dPrice);
    }
}