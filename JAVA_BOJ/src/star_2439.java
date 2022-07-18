import java.util.Scanner;

public class star_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0 ; i<num ; i++){
            int reverse = num-i-1;
            for(int j =reverse;j>0; j-- ){
                System.out.print(" ");
            }
            for(int p =0; p<i+1;p++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}