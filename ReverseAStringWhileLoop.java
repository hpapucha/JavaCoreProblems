package assignments.section2;

public class ReverseAStringWhileLoop{
    public static String solution(String str){

        int length = str.length();
        StringBuilder sb = new StringBuilder();
        // start from the end of the input string
        int i = length - 1;
        while (i >= 0) {
            // add the "next" character to the output
            sb.append(str.charAt(i));
            // step 1 character back
            i--;
        }
        return(sb.toString());
    }
 }





