import java.util.ArrayList;

public class RetrieveSpecifiedElement{
    public static int solution(ArrayList<Integer> list){

        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return 0;
    }
}
