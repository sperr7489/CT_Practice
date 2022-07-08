package 자바강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1_03 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();

        // 입력받은 문자열을 띄어쓰기를 기준으로 나눈다.
        String parsed[] = str.split(" ");

        int length = 0;
        String answer="";
        for(int i=0; i<parsed.length; i++){
            if(length<parsed[i].length()) {
                answer = parsed[i];
                length = parsed[i].length();
            }
        }
        System.out.println(answer);

    }
}
