package 자바강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P1_01 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().toLowerCase().split("");
        String rel = br.readLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(rel)){
                count++;
            }
        }
        System.out.println(count);

    }
}
