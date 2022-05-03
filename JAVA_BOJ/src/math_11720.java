import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math_11720 {
    public static void main(String[] args) throws IOException    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");
        int total = 0;
        for (String num :
                s) {
            total += Integer.parseInt(num);
        }
        System.out.println(total);
    }
}
