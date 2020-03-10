
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        PasswordChecker password = new PasswordChecker();

        Scanner in = new Scanner(System.in);
        {
            System.out.println("Please enter password : ");
            String yourPassword = in.nextLine();
            System.out.println();
            try{
                if(password.isValid(yourPassword )){
                    System.out.println("Password is valid");
                }
                if(password.passwordIsOk()){
                    System.out.println("Password is okay");
                }
                if(password.PasswordNeverOk(yourPassword)){
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

}
