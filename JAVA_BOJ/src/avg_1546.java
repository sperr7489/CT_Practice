import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class avg_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int number;
        number = sc.nextInt();
        double arr[]= new double[number];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextDouble();
        }
        sc.close();

        double sum = 0;
        Arrays.sort(arr);
        double max= arr[number-1];
        double total=0;

        for(double t : arr){
            total+=(t/max*100);
        }
        System.out.println(total/number);
    }
}
