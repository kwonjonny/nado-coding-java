package chap_11;

/**
 * Try - Catch
 */
public class _01_TryCatch {
    public static void main(String[] args) {

        // 오류: 컴파일 오류, 런타임 오류가 있다

        // error 와 exception 두가지 종류의 에러가 있음

        // 컴파일 오류
        // int i = "문자열";


        // 런타임 오류
        // int[] arr = new int[3];
        // arr[5] = 100;


        // StackOverFlowError
        //  S s = new S();
        //  s.methodA();


        // 프로그램이 정상적으로 종료되지 않는다 ( 강제 종료 )
        // S s = null;
        // s.methodA();


        // 이러한 경우에 예외 처리가 필요하다
//        try {
//            S s = null;
//            s.methodA();
//        } catch (Exception e) {
//            throw new RuntimeException("null Pointer Exception: " + e.getMessage());
//        }


//        try {
//            System.out.println(3 / 0);
//        } catch (Exception e) {
//            throw new RuntimeException("Exception: " + e.getMessage());
//        }


//        try {
//            int[] arr = new int[4];
//            arr[5] = 100;
//        } catch (Exception e) {
//            throw new RuntimeException("Exception: " + e.getMessage());
//        }


//        try {
//            Object object = "test";
//            System.out.println((int) object);
//        } catch (Exception e) {
//            throw new RuntimeException("Exception: " + e.getMessage());
//        }

    }
}


class S {
    public void methodA() {
        this.methodA();
    }
}