package JAVA_Lecture.src;

import java.util.Scanner;
import java.util.*;
public class JL0211 {
    static void solution(int[][] arr, int testcase){
        Student[] studentsArr = new Student[testcase];
        for(int k = 0; k<testcase;k++){
            studentsArr[k]= new Student(k+1);
        }

        for(int i=0;i<5;i++){//i 는 행의 번호
            for(int j=0;j<testcase; j++){ // j는 열의 번호
                studentsArr[j].setClassNum(arr[j][i]); // 각 학생들의 반을 입력
            }
            for(int k=0;k<testcase;k++) {
                for (int j = 0; j < testcase; j++) {
                    if (studentsArr[k].getClassNum() == studentsArr[j].getClassNum() && i != j ) {
                        studentsArr[k].plusSameStd(studentsArr[j].getStudentNum());
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int solution = 0;
        for(int i=0;i<testcase;i++){
            if(max<studentsArr[i].sameCnt()){
                solution = studentsArr[i].getStudentNum();
                max = studentsArr[i].sameCnt();
            }
        }

        System.out.println(solution);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int[][] arr = new int[testcase][5];
        for(int i =0;i<testcase;i++){
            for(int j=0;j<5;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        solution(arr,testcase);
    }
}
class Student{
    int sameCnt = 0;
    int studentNum;

    List<Integer> sameStudents = new ArrayList<>();

    public List<Integer> getSameStudents() {
        return sameStudents;
    }

    public void plusSameStd(int stdNum){
        if(!sameStudents.contains(stdNum) && stdNum != this.studentNum){
            sameStudents.add(stdNum);
        }
    }
    public int sameCnt(){
        return sameStudents.size();
    }

    public int getStudentNum() {
        return studentNum;
    }

    int classNum;
    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public int getClassNum() {
        return classNum;
    }

    public Student(int studentNum) {
        this.studentNum = studentNum;
    }

}