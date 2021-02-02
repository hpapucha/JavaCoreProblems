public class FirstAndLast{
    public static boolean solution(String word){


        if (word.length()==0){
            return true;
        }

            var a = word.charAt(word.length()-1);
            var b = word.charAt(0);
            if (a == b){
                return true;
            }
        return false;
    }
}
