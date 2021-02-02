public class SumTheArray{
    public static int solution(int[] numbers){
        int sum = 0;
        for (int val : numbers) {
            sum += val;
        }
        return sum;
    }

}

