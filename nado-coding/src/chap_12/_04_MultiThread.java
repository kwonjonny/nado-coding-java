package chap_12;

/**
 * Multi Thread
 */
public class _04_MultiThread {
    public static void main(String[] args) {
        // 직원 두명을 고용한다

        Runnable clean1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("직원1 청소 시작");
                for (int i = 1; i <= 10; i = i + 2) {
                    System.out.println("직원1 " + i + " 번방 청소 중");
                    try {
                        // 지정 시간 동안 잠시 대기
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println();
            }
        };

        Runnable clean2 = () -> {
            System.out.println("직원2 청소 시작");
            for (int i = 2; i <= 10; i = i + 2) {
                System.out.println("직원2 " + i + " 번방 청소 중");
                try {
                    // 지정 시간 동안 잠시 대기
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println();
        };

        Thread cleanerThread1 = new Thread(clean1);
        Thread cleanerThread2 = new Thread(clean2);
        cleanerThread1.start();
        cleanerThread2.start();
    }
}
