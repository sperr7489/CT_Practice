import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class math_3052 {
    public static void main(String[] args)throws IOException {
        Scanner sc= new Scanner(System.in);
        int[] a= new int[10];
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<10; i++){
            a[i]= sc.nextInt();
            if( !result.contains(a[i]%42)){
                result.add(a[i]%42);
            }
        }
        System.out.println(result.size());
    }
}
