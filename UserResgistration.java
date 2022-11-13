import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserResgistration {

   public static void checkValidFirstName(String firstName) {
       boolean isFirstName;
       String firstNameRegex = "[A-Z]{1}[a-z]{2,}";
       Pattern patternObject = Pattern.compile(firstNameRegex);

       if (firstName == null) {
           isFirstName = false;
       }

       Matcher matcherObject = patternObject.matcher(firstName);
       isFirstName = matcherObject.matches();

       if (isFirstName) {
           System.out.println(firstName+ " is valid first name");
       } else {
           System.out.println(firstName+ " is invalid first name");
       }

   }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name");

        String firstName = scanner.next();
        checkValidFirstName(firstName);

        scanner.close();

    }
}