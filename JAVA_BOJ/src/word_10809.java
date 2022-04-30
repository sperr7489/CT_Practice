import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;

public class word_10809 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<String> result = new ArrayList<>();
        for(int i =97; i<123; i++){
            //a부터 z까지의 아스키 코드

            if(str.indexOf(i)==-1){
                // 존재하지 않을 때
                result.add("-1");
                continue;
            }
            result.add(Integer.toString(str.indexOf(i)));


        }
        System.out.println(String.join(" ", result));

    }
}
