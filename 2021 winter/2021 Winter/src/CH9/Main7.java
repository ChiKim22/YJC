package CH9;

import java.util.*;
import java.util.function.Consumer;

public class Main7 {
public static void main(String[] args){
    /*
        Lamda expression : 이름이 없는 메소드
                           오직 하나의 추상 메소드만을 가지는 인터페이스의 구현이다.
    */

    // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

    List<Integer> list = new ArrayList<>();
    for (int i=1; i<=7; i++) list.add(i);
    
    // for (Integer i : list) System.out.println(i);

    // list.forEach(new Consumer<Integer>(){

    //     @Override
    //     public void accept(Integer t) {
    //         System.out.println(t+" 입니다.");

    //     }
        
    // });

    list.forEach((t) -> System.out.println(t+" ****")); // Lamda Expression


    // 기본형 int, double, float ,... => Wrapper class : Integer, Double, Float, ...
    // 자바는 자동으로 auto boxing, unboxing 된다.
    }
}