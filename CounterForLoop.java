public class CounterForLoop{
    public static String solution(int count){

        String test = "";

        for (int i = count; i >= 0; i--){
            test += i;
        }

        return test;
    }
}
