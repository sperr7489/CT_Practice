import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class min_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int num = Integer.parseInt(str[0]);
        int reVal = Integer.parseInt(str[1]);
        ArrayList<Integer> inputs = new ArrayList<Integer>(); // 타입 지정
        String array[]=br.readLine().split(" ");

        for(String a : array){
            if(Integer.parseInt(a)<reVal){
                //비교되는 값보다 더 작다면 ArrayList에 넣어주도록 한다.
                inputs.add(Integer.parseInt(a));
            }
        }
        for(int a : inputs){
            System.out.print(a + " ");

        }
        System.out.println();

    }
}
