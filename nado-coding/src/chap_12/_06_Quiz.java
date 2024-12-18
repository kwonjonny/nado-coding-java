package chap_12;

/**
 * 퀴즈: 상품 A 와 상품 B 로 이루어진 세트 상품을 효율적으로 포장하는 프로그램을 작성하시오
 *
 * 조건:
 * - 상품 A 와 B 는 개별 5개 씩 준비
 * - 상품 A 와 B 는 두 사람이 독립적으로 준비
 * - 상품 A 와 B 가 모두 준비된 이후 세트 상품 포장 시작
 * - 포장이 필요한 세트 상품은 총 5개
 */
public class _06_Quiz {

    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 5; i++) {
                    System.out.println("A Ready For Gift " + i + " /5");
                }
                System.out.println("A Ready");
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 5; i++) {
                    System.out.println("B Ready For Gift " + i + " /5");
                }
                System.out.println("B Ready");
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable runnableSet = new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 5; i++) {
                    System.out.println("Set For Gift " + i + " /5");
                }
                System.out.println("Set Ready");
            }
        };


        Thread threadSet = new Thread(runnableSet);
        threadSet.start();
    }
}
