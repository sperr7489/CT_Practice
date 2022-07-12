import java.util.*;

public class test {
   static List<int[]> testList = new ArrayList<>();
    public static void main(String[] args) {
        int a = 0;
        int[] ab = {1,2,3,4};

        System.out.println("original a : " + a); // primitive 타입으로 0으로 출력
        System.out.println("original ab : " + ab); // reference 타입으로 [I@27bc2616 이라는 주소"값"이 출력된다.
        int[] testCase = test(a,ab); // ab에는 주소 값 자체가 들어간다.

        System.out.println("original2 ab : " + ab);
        System.out.println("test : " + testCase);

        testList.forEach(d-> System.out.println(Arrays.toString(d))); // final 결국 list의 원소들은 int[] 값으로 해당 주소값을 가지고 있다.
        // => 예상은 [[1,2,3,4], [3,4,5,6], [7,8,9,10]] 이 되었어야 하지만.
        //따라서 [ [I@27bc2616, [I@3941a79c, [I@3941a79c] 이런 식으로 되어 있기 때문에 같은 주소에 대해서는 같은 값이 나오는 것이다.
    }
    public static int[] test( int a, int[] ab){ // ab에는 [I@27bc2616 이 들어온다.
        int[] babo = {3,4,5,6};
        System.out.println("babo : " + babo); //babo의 주솟값은 [I@3941a79c 이다.

        testList.add(ab); // 위의 List에 원소 추가. List에 원소를 추가할 때는 해당 주소에 대해서 추가하는 것이다. 이때 ab의 값은 [I@27bc2616라는 주소이다.
        System.out.println("test a : " + a );
        ab = babo; // ab라는 변수에 babo라는 변수가 갖고 있는 [I@3941a79c 라는 주소값을 대입한다.
        System.out.println("test ab : " + Arrays.toString(ab) );
        System.out.println("test ab : " + ab);
        testList.add(ab); // ab는 현재 [I@3941a79c 라는 주소를 값으로 가지고 있다.
        for (int i=0; i<4; i++ ){
            ab[i]=i+7;
        }
        System.out.println("test ab가 값이 바꼈는지 검사 : "+ Arrays.toString(ab));
        testList.add(ab); // [I@3941a79c라는 ab를 [I@3941a79c라는 값으로 저장되어 있다.
        return ab;
    }

}
