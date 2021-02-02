public class ReverseAnInteger{
    public static String solution(int number){

        String str = String.valueOf(number);
        char c[]=str.toCharArray();
        String reverse="";
//For loop to reverse a string
        for(int i=c.length-1;i>=0;i--){
            reverse+=c[i];
        }
        return(reverse);
    }

}


