import java.util.ArrayList;

public class FindMissingInteger {
    public static int solution(ArrayList<Integer> numbers) {

        for (int i = 1; i <= numbers.size(); i++) {
            if (!numbers.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}

