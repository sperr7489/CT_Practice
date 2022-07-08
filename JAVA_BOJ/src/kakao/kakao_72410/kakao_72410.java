package kakao.kakao_72410;

public class kakao_72410 {
    public static void main(String[] args) {
        String s = "abcdefghijklmn.p.";
        String answer = solution(s);
        System.out.println(answer);

    }
    public static String solution(String new_id){

        //1단계
        String str = new_id.toLowerCase(); // 1단계
//        System.out.println("1 : " + str);

        //2단계
        String match = "[^\\-\\_\\.a-z0-9]";
       str  = str.replaceAll(match,"");
//        System.out.println("2 : " + str);
        //3단계
        String match3 = "(\\.{2,})";
        str = str.replaceAll(match3,".");
//        System.out.println("3 : " + str);

        //4단계

            String match4 = "^\\.|\\.$";
            str = str.replaceAll(match4,"");
//        System.out.println("4 :"+str);

        //5단계
        if(str.length()==0){
            str += "a";
//            System.out.println("5: " + str);

        }
        //6단계
        if (str.length() >= 16) {
            str = str.substring(0,15);
//            System.out.println("6 : " + str);

        }
        //7단계 2자 이하라면
            while(str.length()<=2){
                str += str.charAt(str.length()-1);
//                System.out.println("7 : " + str);

            }
           str= str.replaceAll(match4,"");

        String answer = str;
        return answer;
    }

}
