package chap_11;

/**
 * 퀴즈11 인기가 많은 사품이 선착순으로 판매되는 온라인 쇼핑몰에서
 * 발생할 수 있는 문제를 처리하는 프로그램을 작성하시오
 * <p>
 * 조건
 * - 발생 가능 문제의 2가지 조건: 상품 구매 시간, 상품 매진
 * - 각 문제에 대한 사용자 정의 예외 클래스 작성
 * - 에러 코드에 따른 의도적 예외 발생 및 예외 처리
 * - 모든 클래스는 하나의 파일에 정의
 */
public class _08_Quiz {

    public static void main(String[] args) {
        int errorCode = 2;
        if (errorCode == 0) {
            System.out.println("상품 구매 완료");
        }

        if (errorCode == 1) {
            throw new NoSaleCustomException("상품 구매 시간이 아닙니다.");
        }

        if(errorCode == 2) {
            throw new SoldOutCustomException("매진 되었습니다.");
        }
    }

    public static class NoSaleCustomException extends RuntimeException {
        public NoSaleCustomException(String message) {
            super(message);
        }
    }

    public static class CustomException extends RuntimeException {
        public CustomException(String message) {
            super(message);
        }
    }

    public static class SoldOutCustomException extends RuntimeException {
        public SoldOutCustomException(String message) {
            super(message);
        }
    }
}
