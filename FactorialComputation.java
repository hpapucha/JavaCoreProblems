public class FactorialComputation{
    public static int solution(int n){
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

}

