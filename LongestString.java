public class LongestString{
    public static String solution(String firstWord, String secondWord){

        if (firstWord.length() > secondWord.length()){
            return firstWord;
        }
        return secondWord;
    }
}
