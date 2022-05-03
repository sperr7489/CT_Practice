import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math_2739 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스
        for(int i = 0; i<t;i++){
    // 테스트 케이스 갯수대로
        String str[] =br.readLine().split(" ");
         // 첫번째 반복 횟수.
            for (String word:str[1].split("")) {
                System.out.print(word.repeat(Integer.parseInt(str[0])));
            }
            System.out.println();
        }
    }
}
