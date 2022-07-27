package JAVA_Lecture.src;

import java.util.*;

public class JL0212 {
    static void solution(int[][] resultArr, int stdNum, int testNum){
        // 결과에 대한 2차원 배열과, 학생수, 시험 횟수를 받는다.

        // 먼저 학생 수대로 멘토 클래스들을 생성한다.
        Mentor[] mentors = new Mentor[stdNum];
        for(int i=0; i<stdNum; i++){
            mentors[i] = new Mentor(i,stdNum);
        }

        for(int i=0;i<testNum; i++){
            // 시험 횟수 (행에 해당하겠지)
            for(int j=0; j<stdNum; j++){
                //학생수
                int stdId = resultArr[i][j]-1; // stdId는 제로 인덱스로 시작하기 때문에
                for(int k=0;k<stdNum;k++){
                    if (j>k) {
                        // 이부분은 resultArr[i][j]-1 의 학생이 resultArr[i][k]-1 학생보다
                        // 등수가 낮다는 뜻이다.
//                        System.out.println("i : "+ i +" j : " + j +" k : " + k);
                        mentors[stdId].updateMentee(resultArr[i][k]-1,-1);

                    }
                }
            }
        }
        int sum = 0;
        for(int i=0;i<stdNum; i++){
            sum+= mentors[i].getMenteeNum();
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stdNum = sc.nextInt();
        int testcase = sc.nextInt();

        int[][] arr = new int[testcase][stdNum];
        for(int i =0;i<testcase;i++){
            for(int j=0;j<stdNum;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        solution(arr,stdNum,testcase);
    }

}
class Mentor{ // 멘토 클래스
    List<Integer> mentee = new ArrayList<>(); // 멘티에 대한 리스트

    int stdId;

    int stdNum;
    public Mentor(int stdId, int stdNum) {
        this.stdId = stdId;
        this.stdNum =stdNum;
        for(int i=0; i<stdNum;i++){
                mentee.add(i);
        }
    }
    public int getMenteeNum(){
        int cnt= 0;
        for(int i=0; i<this.stdNum-1; i++){
            if(mentee.get(i)!=-1 && i!=this.stdId){
                cnt++;
            }
        }
        return cnt;
    }
    public void updateMentee(int index, int element){
        mentee.set(index,element);
    }


    public boolean existMentee(int student){
        //멘티로 해당 student가 존재하는지를 검사하는 것.
        return this.mentee.contains(student);
    }

    public void addMentee(int student){
        if(!existMentee(student)){
            // 해당 학생이 존재하지 않는다면 추가하는 것으로 한다.
            this.mentee.add(student);
        }
    }
    public void delMentee(int student){
        // 멘티에서 제외하는 것.
        if(existMentee(student)) this.mentee.remove(student);
    }


}
