import java.util.Arrays;

public class Anagram {
    public static boolean solution(String word1, String word2) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        if (word1.length() != word2.length()) {
            return false;
        }

        char[] a1 = word1.toCharArray();
        char[] a2 = word2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        if (a1 == a2){
            return true;
        }
        return false;



    }
}
