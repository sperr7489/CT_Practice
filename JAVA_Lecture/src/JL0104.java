import java.util.Scanner;
import java.util.*;

public class JL0104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();


        String[] answer = new String[testCase];

        for(int i=0; i<testCase; i++)
        {
            String str = in.next();
            StringBuffer sb = new StringBuffer(str);
            String reverseStr = sb.reverse().toString();
            answer[i]= reverseStr;

        }


        for (String b :
                answer) {
            System.out.println(b);
        }

    }
}
