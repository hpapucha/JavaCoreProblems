import java.util.ArrayList;

public class InsertElementArrayList {
    public static ArrayList<Integer> solution(ArrayList<Integer> list) {

        if (list.size() >= 0) {
            list.add(0, 5);
            return list;
        }

        return null;
    }
}
