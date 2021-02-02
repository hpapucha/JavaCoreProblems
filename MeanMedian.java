import java.text.DecimalFormat;
import java.util.Arrays;

public class MeanMedian{
    public static String solution(int a, int b, int c) {

        float mean = ((a + b + c) / 3f);
        //median
        int intArr[];
        intArr = new int[3];
        intArr[0] = a;
        intArr[1] = b;
        intArr[2] = c;
        Arrays.sort(intArr);
        String s = String.valueOf(intArr[1]);
        return ((mean) + " " + s);
    }
}
