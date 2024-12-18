package chap_11;

/**
 * Finally
 */
public class _04_Finally {

    public static void main(String[] args) {
        try {
            System.out.println("택시를 탑승");
//            throw new RuntimeException("휴무 택시");
        } catch (Exception e) {
            throw new RuntimeException("Exception: " + e.getMessage());
        } finally {
            // 무조건 실행 되어야 하는 메소드일 경우에 사용
            System.out.println("택시의 문을 닫는다");
        }

        try {
            System.out.println(3 / 0);
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }

    // try + catch
    // try + catch + finally
    // try + finally 로 사용된다
}
