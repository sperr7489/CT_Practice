package kakao_92342;

import java.lang.reflect.Array;
import java.util.*;

public class kakao_92342 {
    static int max = -1;
    static List<int[]> answerList = new ArrayList<>();
    public static void main(String[] args) {
        int n = 9;
        int[] info ={0,0,1,2,0,1,1,1,1,1,1};
        int[] result = solution(n,info);
        answerList.forEach(d-> System.out.println("test"+Arrays.toString(d)));
//        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int n, int[] info) { //n은 화살의 갯수, info는 어피치가 쏜 과녁의 점수
        // 10-i 번째 인덱스가 해당 인덱스의 점수가 된다.
        int[] answer = new int[11]; // 0으로 전부 초기화.
        int[] lionInfo = new int[11]; // 0으로 전부 초기화 시켰다.

        dfs(0,n,info,lionInfo,answer);

        Collections.sort(answerList,(t1,t2)->{
            for(int i=10; i>=0;i--){
                if(t1[i]!=t2[i]){
                    return t2[i]-t1[i];
                }
            }
            return 0;
        });

//        System.out.println("original " +Arrays.toString(answer));


        return (max == -1) ? new int[]{-1} : answerList.get(0);
    }
    // DFS를 통해 완전 탐색을 이룬다.
        public static void dfs (int target, int arrowCount,int[] apeachInfo, int[] lionInfo, int[] answer ){
            //과녁,남은 화살의 갯수, 어피치가 맞춘 과녁의 정보, 라이언이 맞춘 과녁의 정보.

            int apeach=0;
            int lion=0;
            int diff = 0; // 점수 차이
            //반환될 수 있는 케이스를 따져주어야만 한다.
            if(arrowCount<=0 || target==10){

//                System.out.println(arrowCount);
                lionInfo[10] += arrowCount; //0점은 있든 없든 점수와 무관.
            //남은 화살의 갯수가 없거나 과녁이 0일 경우에 점수를 계산한다.
                for(int i = 0; i<11; i++){
                    if(apeachInfo[i] < lionInfo[i]){
                        // 어피치가 이긴 경우.
                        // 10 - i 가 해당 인덱스가 가리키는 과녁의 점수가 된다.
                        lion+=(10-i);
                    }else{
                        // 라이언이 이긴 경우.
                        if(apeachInfo[i]>0)
                        apeach+=(10-i);
                    }
                }

                diff = lion-apeach;
                if(diff > 0 ){ // 라이언이 이긴경우
                    //answer에 대해서
                    if(diff > max){
                        // 기존보다 더큰 점수차이로 이긴 경우
                        answerList.clear();
                        max = diff;

                        answer = lionInfo;
                        answerList.add(answer);
                    }
                    else{
                        if(diff == max){
                            // 기존과 같은 점수 차이로 이긴 경우. 더 낮은 점수로 이길 경우를 answer로 만들어준다.
                            answer = lionInfo;
                            answerList.add(answer);
                        }
                    }
                }
                // 라이언이 진 경우.
                return;
            }
            if(apeachInfo[target]<arrowCount) {
                //어피치가 특정 과녁에 쏜 화살의 갯수보다 남은 화살의 갯수가 많다면 라이언이 이길 수 있다.
                // lionInfo가 바뀌게 되면 해당에 대해선 새로운 배열을 넣어줘야 한다.
                int[] nextLion = lionInfo.clone();
                nextLion[target] += (apeachInfo[target] + 1); // 라이언이 이긴 경우.
                dfs(target + 1, arrowCount - nextLion[target], apeachInfo, nextLion,answer);
//                lionInfo[target] -= (apeachInfo[target] + 1); // 다음 진 경우에 대해서 lionInfo의 상태를 원래대로 되돌려놓는 처리.
            }
            // 라이언이 특정 과녁에서 진 경우.
            dfs(target+1,arrowCount,apeachInfo,lionInfo,answer); // 다음 과녁으로 진행

    }
}
