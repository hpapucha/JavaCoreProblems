import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListDescending{
    public static ArrayList<Integer> solution(ArrayList<Integer> list){

        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
