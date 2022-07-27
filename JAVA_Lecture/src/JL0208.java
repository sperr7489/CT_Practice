package JAVA_Lecture.src;

import java.lang.reflect.Array;
import java.util.*;

public class JL0208 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
//        Map<Integer, Integer> listOfTop = new HashMap<>(); // 등수와 점수를 저장할 map
        List<rank> listOfTop = new ArrayList<>();
        String[] strArr = str.split(" ");
        String[] temp = strArr.clone();

        int top = 1;

//        10
//        12 12 16 12 100 87 99 95 46 46

        int flag = 1; // 동점자에 따른 index를 가리기 위한 flag;
        Arrays.sort(strArr, (i1,i2)-> Integer.parseInt(i2)- Integer.parseInt(i1));// 내림차순으로 정렬.
        int previousNum = Integer.parseInt(strArr[0]);
//        System.out.println(Arrays.toString(strArr));
//        System.out.println(Arrays.toString(temp));
        for (String a :
                strArr) {
            if (previousNum == Integer.parseInt(a)) {
                // 이전것과 점수가 같거나 처음이라면??
                listOfTop.add(new rank(top, Integer.parseInt(a)));
                flag++;
                continue;
            }
            // 이전것과 점수가 다를 때


            top=flag;
            listOfTop.add(new rank(flag, Integer.parseInt(a)));
            flag++;
            previousNum = Integer.parseInt(a);
        }
//        for (rank a :
//                listOfTop) {
//            System.out.print(a.getRank()+ " ");
//        }
//        System.out.println("정답");

       for(int i=0; i<testCase;i++){

           for (int j=0 ;j<testCase; j++) {
               if(listOfTop.get(j).getPoint()==Integer.parseInt(temp[i])){
                   System.out.print(listOfTop.get(j).getRank()+" ");
                   break;
               }
           }

       }
//        String test= "21 27 13 26 27 17 23 7 1 25 14 1 1 17 5 24 16 10 20 8 10 4 22 5 12 27 30 8 14 19";
//        System.out.println();
//       String[] test2 =test.split(" ");
//       Arrays.sort(test2,(i1,i2)->Integer.parseInt(i1)- Integer.parseInt(i2));
//        System.out.println(Arrays.toString(test2));

    }

}

class rank{
    int rank;
    int point;
    public rank(int rank, int point) {
        this.rank = rank;
        this.point = point;
    }

    public int getRank() {
        return rank;
    }

    public int getPoint() {
        return point;
    }
}