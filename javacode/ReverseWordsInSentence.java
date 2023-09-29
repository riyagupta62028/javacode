public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Sentence: " + reversed.toString().trim());
    }
}
