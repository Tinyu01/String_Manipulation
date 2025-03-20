/*
Imagine your friend Samantha created a simple user registration form capturing first names, last names, and email addresses. Your challenge is to write code to help Samantha manipulate a String and return the desired outputs.

Instructions
Complete these steps in the interactive code block:

Declare and initialize the variable firstName = “Harry”.

Declare and initialize the variable lastName = “Grow”.

Declare and initialize the variable email = “harry.grow@example.com”.

Using the method toLowerCase() and the + operator, concatenate firstName and lastName after converting it to lowercase, then assign it to the variable username. Hint: The variable username should contain “harrygrow”.

Correct the email address from “example.com” to “gmail.com”. Hint: Use the replace() method to change the email address to “harry.grow@gmail.com”.

Find the index of ‘@’ in the email address. You can use the indexOf() method for this purpose.

 */

public class Java_Challenge {

    public static void main(String args[]) {
        String firstName = "Harry";
        String lastName = "Grow";
        String email = "harry.grow@example.com";

        String toLowerFirstName = firstName.toLowerCase();
        String toLowerLastName = lastName.toLowerCase();

        String fullName = toLowerFirstName+toLowerLastName;

        String correctEmail = email. replace("example", "gmail");
        int position =email.indexOf('@');

        System.out.println("'username' after conversion and concatenation: " + fullName);
        System.out.println("'email' after replacing example.com with gmail.com: " + correctEmail);
        System.out.println("index of @ in the email address is: " + position);

    }

}
