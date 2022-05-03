import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(yunCheck(Integer.parseInt(str))){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }

    public static boolean yunCheck(int a){
        if(a%4 == 0){
            if(a%100!=0 || a%400 == 0){
                return true;
            }
        }
        return false;
    }
}
