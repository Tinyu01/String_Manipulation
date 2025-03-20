public class Activity_Get_Coding {

    public static void main(String[] args) {
        String sentence = "Java programming is fun and educational";
        System.out.println("Original title: " + sentence);

        // Declare and initialize the searchWord
        String searchWord = "fun";
        // Check if the searchWord is present in sentence
        boolean containsWord = sentence.contains(searchWord);
        System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);

        // Replace 'e' with 'a' and print the output
        String replacedEducationalWith_Awesome = sentence.replace("educational", "awesome");
        System.out.println("The sentence \"" + sentence + "\" with word \"educational\" replaced with word \"awesome\": " + replacedEducationalWith_Awesome);

        int sentenceLength = sentence.length();
        System.out.println("Length of the Sentence: " + sentenceLength);

        //Declare and initialise the length of shortened book title
        int maxLength = 17;
        // Shortened the sentence
        String shortSentence = sentence.substring(0, maxLength);
        System.out.println("Shortened title: " + shortSentence);




    }

}
