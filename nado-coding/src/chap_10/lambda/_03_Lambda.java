package chap_10.lambda;

/**
 * 람다 식
 */
public class _03_Lambda {
    public static void main(String[] args) {
        // (전달값1, 전달값2 ,,, ) -> { 코드 } 순으로 람다식 표현이 가능하다
    }

    // 이걸 람다식으로 바꿔보자
    public void print() {
        String s = "test";
        System.out.println(s);
    }

//    () -> {
//        String s = "test";
//        System.out.println(s);
//    }

    // 이것도 람다식으로 변형
    public void print(String s) {
        System.out.println(s);
    }

//    s -> {
//        System.out.println(s);
//    }

    // 전달값 두개 반환값 있음
    public int add(Integer x, Integer y) {
        return x + y;
    }

//    (x,y) -> {
//        return x + y;
//    }

}