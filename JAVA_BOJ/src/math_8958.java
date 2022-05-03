import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] result = new int[t];
        String str;
        for(int  i = 0; i<t; i++){
            str = br.readLine();
            result[i]= sumOfRight(str);
        }
        for (int a :
                result) {
            System.out.println(a);
        }

    }
    public static int sumOfRight(String str){
        int total=0;
        String[] s = str.split("");
        int sumVal = 0;
        for(int i=0; i<s.length;i++){
            if(s[i].equals("O")){
                //문제를 맞은 경우
                sumVal++;
                total += sumVal;
            }else {
                sumVal = 0;
            }
        }


        return total;
    }
}
