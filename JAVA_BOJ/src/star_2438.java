import java.util.Scanner;

public class star_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 몇번째 줄까지 할 것인지.
        for(int i =0; i<num; i++){
            for (int j=num-i-1;j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}