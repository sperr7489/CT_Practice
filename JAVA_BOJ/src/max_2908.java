import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class max_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str  = br.readLine();
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();
        String[] val = reverse.split(" "); // 공백을 기준으로 나누어줬다.
        int result = Integer.parseInt(val[0]) > Integer.parseInt(val[1]) ?
                Integer.parseInt(val[0]) : Integer.parseInt(val[1]);
        System.out.println(result);
    }
}
