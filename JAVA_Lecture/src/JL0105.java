import java.util.Arrays;
import java.util.Scanner;

public class JL0105 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.next();

        String sol =solution(str);
        System.out.println(sol);
    }
    public static String solution(String str){

        StringBuilder sb = new StringBuilder(str);
        String matches = "[^a-zA-Z]";
        String newStr = String.join("",str.split(matches));

        char[] reverseStr  = new StringBuilder(newStr).reverse().toString().toCharArray();
        int i = 0;


        int d=0;
        for (String a :
                str.split("")) {

            if(!a.matches(matches)){
                sb.setCharAt(d,reverseStr[i]);
                i++;
            }
            d++;
        }

        return sb.toString();
    }
}
