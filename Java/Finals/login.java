package Java.Finals;

import java.util.*;

public class login {
    public void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);

        int x = 0;

        while (true){
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();

            if (username.equals("admin") && password.equals("password")){
                System.out.println("Login Successful");
                break;
            } else {
                x++;
                System.out.println("Attempt #" + x);
            }

            if(x == 3){
                System.out.println("Authentication Failed " + x + " times. Please try again.");
                break;
            }
        }
        sc.close();
    }
}
