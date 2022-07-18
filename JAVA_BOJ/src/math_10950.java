import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class math_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String input;
        while ( (input = br.readLine()) != null ){
                // 만약 위에서처럼 null이 되었다면 입력값이 입력되지 않았다는 뜻
            if(input.equals("0 0")){
                break;
            }
            StringTokenizer st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.add(sumString(a,b));
        }
        for(int a :arr){
            System.out.println(a);
        }
        System.out.println("0 0");
    }
    public static int sumString(int a,int b){
        return a+b;
    }
}
