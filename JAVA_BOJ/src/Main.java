public class Main
{
    public static void main(String[] args)
    {
        String result2 = "프로그래밍 - ";
        String java = "자바";
        String android = "안드로이드";
        String result = java + android;
        result2 += java += android;
        System.out.println(result);
        System.out.println(result2);
    }

}
// > 자바안드로이드