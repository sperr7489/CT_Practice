package kakao.kakao_92334;

import java.util.Arrays;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int len = id_list.length;
        int[] answer = new int[len];
        int[][] matrix = new int[len][len];
        int[] reported = new int[len]; // 신고 당한 인덱스의 횟수.
        for (String a :
                report) {
            //각 행에 완료.
            String[] relVal = a.split(" ");
            int reportIdx = Arrays.asList(id_list).indexOf(relVal[0]); // 신고를 한사람.
            int reportedIdx = Arrays.asList(id_list).indexOf(relVal[1]); // 신고를 당한사람.

            if(matrix[reportIdx][reportedIdx] != 1){
                matrix[reportIdx][reportedIdx]= 1;
                reported[reportedIdx]+=1;
            }
        }
        for(int i=0; i<reported.length; i++){
            if (reported[i] >= k) {
                //신고 당한 횟수가 k번 이상인 경우.
                for(int q = 0 ; q<len; q++){
                    if(matrix[q][i]==1){
                        answer[q]+=1;
                    }
                }
            }
        }
        return answer;
    }
}