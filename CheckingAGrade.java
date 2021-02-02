public class CheckingAGrade{
    public static String solution(int grade){

        if (grade <= 100 && grade >= 90){
            return "A";
        }
        else if (grade <=89 && grade >=80){
            return "B";

        }
        else if (grade <=79 && grade >=70){
            return "C";
        }
        return "FAILURE";
    }
}
