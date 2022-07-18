package JAVA_Lecture.src;

public class JL0111 {
    public static void main(String[] args) {

    }

    public static String solution(String str) {
        int flag = 0;
        String previousStr = String.valueOf(str.charAt(0));
        StringBuilder sb = new StringBuilder();
        int i=0;
        for (String s :
                str.split("")) {
            i++;
            if (s.equals(previousStr)) { // 이전것과 똑같다면 flag를 업시켜준다.
                flag++;
            } else {
                // 이전것과 같지 않다면 flag의갯수만큼 붙여준다.
                if (flag == 1) {
                    sb.append(previousStr);
                } else{
                    sb.append(previousStr+flag);
                }
                previousStr = s;  //다음 것을 비교할 때 몇번 나오는 지 확인하기 위해서
                flag=1;
            }
            // 마지막인 경우엔 지금까지의 판단을 해주어야만 한다.
            if(i==str.length()){
                if(flag ==1){
                    sb.append(previousStr);
                }
                else{
                    sb.append(previousStr+flag);
                }
            }
        }

        return sb.toString();
    }

}
