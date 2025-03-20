public class Main {
    public static void main(String args[]) {
        String text = "Adventure";

        System.out.println("The full string is: " + text);


        // Check the length using length() and print the length
        int length = text.length();
        System.out.println("The length of the String: " + text + " is : " + length + " letters.");

        // Get the character at position 3 and print the character
        char letter = text.charAt(3);
        System.out.println("The character at index 3 is: " + letter);

        // Get a part of the String from position 1 to 4 and print the string
        String partFrom1To4 = text.substring(1, 4);
        System.out.println("The substring from index 1 to 4. 4 excluded: " + partFrom1To4);

        String anotherText= "Adventure";

        // Compare text with anotherText using equals() and print the output
        System.out.println("The Original text: \"" + anotherText + "\"");
        boolean result = text.equals(anotherText);
        System.out.println("Using equals() method \"" +  text + "\" is equal to \"" + anotherText + "\": " + result);

        // Change to uppercase using toUpperCase() and print the converted string
        String anotherTextInUpperCase = anotherText.toUpperCase();
        System.out.println("The Original text converted to uppercase: \"" + anotherTextInUpperCase + "\"");

        // Change to lowercase using toLowerCase() and print the converted string
        String anotherTextInLowerCase = anotherText.toLowerCase();
        System.out.println("The Original text converted to uppercase: \"" + anotherTextInLowerCase + "\"");

        // Check if it contains "vent" using contains() and print the output
        boolean hasVent = anotherText.contains("vent");
        System.out.println("The Word \"" + anotherText + "\" contains the substring \"Vent\": " + hasVent);


        // Replace 'e' with 'a' and print the output
        String wordWithLetter_E_replacedWith_A = anotherText.replace('e','a');
        System.out.println("The Word \"" + anotherText + "\" with character \"e\" replaced with character \"a\": " + wordWithLetter_E_replacedWith_A);
    }
}