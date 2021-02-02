public class TypeConversion{
    public static Object solution(Object object){

        if(object.getClass() == String.class) {
            //turn string to integer
            int i = Integer.parseInt(object.toString());
            return i;
        }

        else if (object.getClass() == Integer.class){
            //turn integer to string
            String s = object.toString();
            return s;
        }
        else if (object.getClass() == Character.class){
            //turn char to string
            String sTwo = object.toString();
            return sTwo;
        }

        return false;
    }
}
