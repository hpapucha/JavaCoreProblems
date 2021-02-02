import java.util.ArrayList;

public class UpdateSpecificElement {
    public static ArrayList<Integer> solution(ArrayList<Integer> list, int val, int index) {

        if (index < 0 || index >= list.size()) {
            return list;
        }
        list.set(index, val);
        return list;



        }

    }

