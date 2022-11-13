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

   public static void checkValidEmail(String email) {
       boolean isEmail;
       String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . +_]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
       Pattern patternObject = Pattern.compile(emailRegex);

       if (email == null) {
           isEmail = false;
       }

       Matcher matcherObject = patternObject.matcher(email);
       isEmail = matcherObject.matches();

       if (isEmail) {
           System.out.println(email+ " is a Valid Email address \n");
       }else {
           System.out.println(email+ " is a invalid Email address \n");
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

        System.out.println("Enter your email address");
        String email = scanner.next();
        checkValidEmail(email);

        scanner.close();

    }
}