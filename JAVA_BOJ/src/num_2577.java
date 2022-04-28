import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class num_2577 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<10; i++){
            map.put(i,0);
        }
        int total = 1;
        for(int i =0; i<3; i++){
            total *= Integer.parseInt(br.readLine());

        }

        String str[] = Integer.toString(total).split("");
        for(int i = 0; i< str.length;i++){
            map.replace(Integer.parseInt(str[i]),map.get(Integer.parseInt(str[i]))+1);
        }
        for (int i=0; i<10; i++){
            System.out.println(map.get(i));
        }
    }
}
