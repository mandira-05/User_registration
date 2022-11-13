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
           System.err.println(firstName+ " is invalid first name");
       }

   }

   public static void checkValidLastName(String lastName) {

       boolean isLastName;
       String lastNameRegex = "[A-Z]{1}[a-z]{2,}";
       Pattern patternObject = Pattern.compile(lastNameRegex);

       if (lastName == null) {
           isLastName = false;
       }

       Matcher matcherObject = patternObject.matcher(lastName);
       isLastName = matcherObject.matches();

       if (isLastName) {
           System.out.println(lastName+ " is an Valid Last Name");
       }else {
           System.err.println(lastName+ " is an invalid Last Name");
       }


   }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scanner.next();
        checkValidFirstName(firstName);

        System.out.println("Enter your last name");
        String lastName = scanner.next();
        checkValidLastName(lastName);



        scanner.close();

    }
}