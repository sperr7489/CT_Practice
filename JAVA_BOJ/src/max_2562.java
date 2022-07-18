import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class max_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[9];
        int max =-1;
        int index =-1;
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max<arr[i]){
                //최댓값이 수정된다면
                max = arr[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
