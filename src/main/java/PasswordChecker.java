import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordChecker {
    private static ArrayList<String> listOfErrors= new ArrayList<>();
    public static boolean isValid(String yourPassword ){
        Pattern specialCharPatten = Pattern.compile("[$&+,:;=?@#|'<>.^*()%!-]", Pattern.CASE_INSENSITIVE);
        Pattern digitCasePatten = Pattern.compile("[0-9]");
        Pattern UpperCasePatten = Pattern.compile("[A-Z]");
        Pattern lowerCasePatten = Pattern.compile("[a-z]");

        boolean flag = true;

        if(yourPassword.isEmpty()){
            System.out.println("password does not exist ");
            flag = false;
            listOfErrors.add("password does not exist ");
        }
        if (yourPassword.length() < 8) {
            System.out.println("Password length must have at least 8 character ");
            flag = false;
            listOfErrors.add("Password length must have at least 8 character ");
        }
        if (!specialCharPatten.matcher(yourPassword ).find()) {
            System.out.println("Password must have at least one special character ");
            flag = false;
            listOfErrors.add("Password must have at least one special character ");
        }
        if (!UpperCasePatten.matcher(yourPassword ).find()) {
            System.out.println("Password must have at least one uppercase character ");
            flag = false;
            listOfErrors.add("Password must have at least one uppercase character ");
        }
        if (!lowerCasePatten.matcher(yourPassword ).find()) {
            System.out.println("Password must have at least one lowercase character ");
            flag = false;
            listOfErrors.add("Password must have at least one lowercase character ");
        }
        if (!digitCasePatten.matcher(yourPassword ).find()) {
            System.out.println("Password must have atleast one digit character ");
            flag = false;
            listOfErrors.add("Password must have atleast one digit character ");
        }
        return flag;
    }
    public static boolean passwordIsOk(){
        boolean flag = false;
        if(listOfErrors.size()<=3){
            flag = true;
        }
        return flag;
    }
    public static boolean PasswordNeverOk(String password){
        boolean flag = false;
        if(password.isEmpty() && password.length() < 8) {
            return flag;
        }else{
            System.out.println("Password meets condition 1 and 2");
        }
        return flag;
    }


}
