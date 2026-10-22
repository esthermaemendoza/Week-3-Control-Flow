/**
 *
 * @author ADMIN
 */
public class NestedLogInValidatorWeek3 {
    public static void main(String[] args) {
        String usname = "Mae'swifi";
        String pass = "09876";
        boolean accLocked = false;
        
        if (usname.equals("Mae'swifi")) {
            if(pass.equals("09876")) {
                if (!accLocked) {
                    System.out.println("Login Successfully");
                } else {
                    System.out.println("Login Failed: Incorrect Password."); 
                }
            } else {
                System.out.println("Login Failed: Incorrect Username."); 
            }
        } else {
            System.out.println("Login Failed: Account is Locked."); 
        }
    }
}
