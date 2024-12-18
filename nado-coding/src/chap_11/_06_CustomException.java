package chap_11;

/**
 * 사용자 정의 Exception
 */
public class _06_CustomException {
    public static void main(String[] args) {

        // 모든 일에 대해서 한번에 Exception 처리를 하기 힘들다 그러므로 사용자 정의 예외를 만드는것이 가장 중요하다

        int age = 15;
        if (age < 19) {
            throw new ServiceException("만 19세 미만에게는 판매하지 않습니다");
        }
    }
}

class ServiceException extends RuntimeException {

    public ServiceException(String message) {
        super(message);
    }

}
