public class CheckForPalindrome {
    public static boolean solution(String pally) {

        String reverse = "";

        for (int i = pally.length() - 1; i >= 0; i--) {
            reverse += pally.charAt(i);
        }

        if (pally.equals(reverse)) {
            return true;
        }
        return false;
    }
}
