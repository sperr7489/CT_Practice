import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class dfs_1058 {
    static boolean[] vistied = new boolean[9];
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        String[][] str = new String[t][t];
        int flag[] = new int[t]; // 최대 두번만 dfs를 진행하기 위함.


        for(int i= 1; i<=t; i++){
            str[i]= br.readLine().split("");
//            System.out.println(Arrays.toString(str[i]));
        }
        System.out.println(Arrays.toString(str[0]));
        System.out.println(Arrays.toString(str[1]));
        System.out.println(Arrays.toString(str[2]));
    }
    public static void dfs(int node , String[][] str, int flag){
        vistied[node] = true;

    }

}
