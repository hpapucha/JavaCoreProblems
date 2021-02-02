public class FizzBuzzBaz{
    public static String solution(int fuzzy){
        if (fuzzy%3 ==0 && fuzzy%5 ==0){
            return "fizz buzz baz";
        }
        if (fuzzy%3 == 0){
            return "fizz";
        }
        else if (fuzzy%5 == 0) {
            return "buzz";
        }
        return "Fizzled";
    }
}
