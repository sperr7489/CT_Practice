import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class calendar_2884 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            int num = Integer.parseInt(str);
            int temp_str[] = new int[num];

            String count[] = br.readLine().split(" "); //시 분으로 쪼갠다.
        for (int i = 0; i<num; i++){
            temp_str[i] = Integer.parseInt(count[i]);
        }
        Arrays.sort(temp_str);
            System.out.println(temp_str[0]+" " + temp_str[num-1]);
        }
}
