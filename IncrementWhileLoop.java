public class IncrementWhileLoop{
    public static String solution(int from, int to){

        String solution = "";

        while (from <= to){
            solution +=from;
            from++;
        }

        return solution;
    }


}
