/**
 * Created by avck25 on 7/15/2018.
 */
@SuppressWarnings("SpellCheckingInspection")
public class EvaluateLongestWord {

    private String longestWord;
    private int length;
    private int numberOfWords;
    private String errorMessage;

    public EvaluateLongestWord() {
    }

    //adding constructor where you can pass in the sentence and it calls findLongestWord
    public EvaluateLongestWord(String sentence) {
        findLongestWord(sentence);
    }

    public void findLongestWord(String sentence) {

        //Handling null or empty string being passed in setting error message
        if (sentence == null || sentence.trim().isEmpty()) {
            this.errorMessage = "no sentence passed in can't evaluate";
            return;
        }
        //if called again with not null sentence set error message to null
        this.errorMessage = null;

        //trimming white space so as not to evaluate extra whitespace
        sentence = sentence.trim();

        //if only one word passed in no need to do the rest of the method
        if (!sentence.contains(" ")) {
            this.longestWord = sentence;
            this.length = sentence.length();
            this.numberOfWords = 1;
            return;
        }

        //not wanting to keep changing the instance variables
        int tempLength = 0;
        String tempLongestWord = "";
        int tempNumberOfWords = 0;

        String[] words = sentence.split(" ");

        for (String word : words) {

            if (tempLength == 0 || word.length() > tempLength) {
                tempLength = word.length();
                tempLongestWord = word;
                tempNumberOfWords = 1;
                // handling multiple words of same length
            } else if (word.length() == tempLength) {
                tempLongestWord = tempLongestWord + ", " + word;
                tempNumberOfWords++;
            }
        }

        this.longestWord = tempLongestWord;
        this.length = tempLength;
        this.numberOfWords = tempNumberOfWords;
    }


    //getters  for private variables
    public String getLongestWord() {
        return longestWord;
    }


    public int getNumberOfWords() {
        return numberOfWords;
    }


    public int getLength() {

        return length;
    }


    public String getErrorMessage() {
        return errorMessage;
    }


}
