package chap_11;

/**
 * Throw
 */
public class _03_Throw {
    public static void main(String[] args) {
        // 원해서 Exception 을 발생시킬수 있다
        int age = 17; // 만나이 17세

        try {
            if(age < 19) {
                throw new Exception("만 19세 미만에게는 판매하지 않습니다.");
            }

        } catch (Exception e) {

        }

    }
}
