/**
 *
 * @author ADMIN
 */
public class ATMTransactionAuthorizerWeek3 {
    public static void main(String[] args) {
        
        String usName = "admin";
        String correctUsName= "admin";
        
        int pin = 5432;
        int correctPin = 5432;
        
        double balance = 5000;
        double withdrawalAmount = 4000;
        
        String Tier = "";
        double dailyLimit = 0;
        double feePercentage = 0;
        
        if(usName.equals(correctUsName)) {
            if (pin == correctPin){
                System.out.println("Login Successfully");
                
                if (balance >= 80000) {
                    Tier = "Platinum";
                    dailyLimit = 80000;
                }else if (balance >= 45000){
                    Tier = "Gold";
                    dailyLimit = 45000;
                } else if (balance >= 10000) {
                    Tier = "Silver";
                    dailyLimit = 10000;
                } else {
                    Tier = "Bronze";
                    dailyLimit = 3000;
                }
                
                System.out.println("Account Tier:" + Tier);
                
                switch (Tier) {
                    case "Bronze":
                        feePercentage = 0.02;
                        break;
                    case "Silver":
                        feePercentage = 0.015;
                        break;
                    case "Gold":
                        feePercentage = 0.01;
                        break;
                    case "Platinum":
                        feePercentage = 0.005;
                        break;
                }
                
                double transactionFee = withdrawalAmount * feePercentage;
                double totalAmount = withdrawalAmount + transactionFee;
                
                System.out.println("Withdrawal Amount: " + withdrawalAmount);
                System.out.println("Transaction Feee:" + transactionFee);
                
                if (totalAmount <= balance) {
                    if (withdrawalAmount <= dailyLimit) {
                        balance = balance - totalAmount;
                        
                        System.out.println("Transaction: APPROVED");
                        System.out.println("Remaining Balance: " + balance);
                    } else {
                        System.out.println("Transaction: DENIED");
                        System.out.println("Reason: Withdrawal exceeds daily limit");
                    }
                } else {
                    System.out.println("Transaction: DENIED");
                    System.out.println("Reason: Insufficient balance");
                }
                
            } else {
                System.out.println("Login Failed: Incorrect PIN.");
            }
        }else {
            System.out.println("Login Failed: Incorrect Username");
        }
        
    }
}
