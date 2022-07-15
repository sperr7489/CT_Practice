import java.util.Scanner;

public class JL0103 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine() ;
        String[] str = input1.split(" ");

        int max = -1;
        String answer="";
        for (String a :
                str) {
            if(a.length()>max){
                max = a.length();
                answer = a;
            }

        }

        System.out.println(answer);


        return;
    }

}
