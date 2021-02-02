import java.util.ArrayList;

public class ReversePositiveInteger{
    public static int solution(int number){


       int reversed = 0;

        for(;number != 0; number/= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }

        return reversed;
    }
}


