import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math_9498 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a>=90){
            System.out.println("A");
            return;
        } else if (a>=80) {
            System.out.println("B");
            return;
        } else if (a>=70) {
            System.out.println("C");
            return;
        } else if (a>=60) {
            System.out.println("D");
            return;
        }else {
            System.out.println("F");
            return;
        }
    }
}
