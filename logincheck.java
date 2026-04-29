import java.util.*;
public class logincheck {
    public static void main(String[] args) {
    
        String defaultUsername = "admin";
        String defaultPassword = "java123";

       
        String enteredUsername = "admin";
        String enteredPassword = "java123";

       
         if (enteredUsername.equals(defaultUsername) && enteredPassword.equals(defaultPassword)) {
            System.out.println("login Successful");
        } else {
            System.out.println("Access Denied");
        }
    }
}
