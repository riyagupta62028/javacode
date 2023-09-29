public class TextAnalyzer {
    public static void main(String[] args) {
        String text = "This is a sample sentence. It has multiple words and punctuation.";

        int wordCount = countWords(text);
        int sentenceCount = countSentences(text);
        int characterCount = text.length();

        System.out.println("Word Count: " + wordCount);
        System.out.println("Sentence Count: " + sentenceCount);
        System.out.println("Character Count: " + characterCount);
    }

    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    public static int countSentences(String text) {
        String[] sentences = text.split("[.!?]");
        return sentences.length;
    }
}
