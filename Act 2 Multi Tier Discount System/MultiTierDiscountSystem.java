/**
 *
 * @author ADMIN
 */
public class MultiTierDiscountSystemWeek3 {
    public static void main(String[] args) {
        
        double purchAmount = 8000;
        double disc = 0;
        
        if (purchAmount >= 10000) {
            disc = 0.20;
        } else if (purchAmount >= 3000) {
            disc = 0.10;
        } else if (purchAmount >= 1000) {
            disc = 0.05;
        } else {
            disc = 0;
        }
        
        double discPrice = purchAmount - (purchAmount * disc);
        
        System.out.println("Purchase Amount: " + purchAmount);
        System.out.println("Discount Tier: " + (disc * 100 +"%"));
        System.out.println("Final Discount Price: " + discPrice);
     }
}
