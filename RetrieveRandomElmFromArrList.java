import java.util.ArrayList;
import java.util.Random;

public class RetrieveRandomElmFromArrList{
    public static Integer solution(ArrayList<Integer> arrList, int index){

        if(arrList.size()<=index){
            return 0;
        }

        return arrList.get(index);



    }
}
