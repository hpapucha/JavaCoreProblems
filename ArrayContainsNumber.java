import java.util.Arrays;

public class ArrayContainsNumber {
    public static boolean solution(int[] nums, int num) {
        return Arrays.stream(nums).anyMatch(i -> i == num);

    }
}
