import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMaxMinArray{
    public static ArrayList<Long> solution(int[] nums) {

        ArrayList<Long> returnlist = new ArrayList<>();
        if (nums.length ==0 ){
            returnlist.add(0L);
            returnlist.add(0L);
            return returnlist;
        }

        Arrays.sort(nums);
        long largest = nums[nums.length - 1];
        long smallest = nums[0];


        returnlist.add(largest);
        returnlist.add(smallest);
        return returnlist;
    }


}



