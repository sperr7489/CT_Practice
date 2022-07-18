import java.io.*;

public class math_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        String token[]=str.split(" ");
        int total = 0;
        for(String num : token){
            total+=Math.pow(Integer.parseInt(num),2);
        }

        System.out.println(total%10);
/***
 *
 *
 *      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 *
 *         writer.write(total%10+"\n");
 *         writer.flush();
 *         writer.close();
 *
 *
 * ***/

    }
}
