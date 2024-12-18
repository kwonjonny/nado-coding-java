package chap_12;

/**
 * Runnable
 */
public class _02_Runnable {
    public static void main(String[] args) {
        // Runnable 이라는 Interface 를 구현 후 Thread 를 생성하는 방법이 있다
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);

        thread.start();
        cleanByBoss();

        // Runnable 은 여러개의 인터페이스를 구현 할 수 있다 Thread 는 extends 즉 상속을 받아야한다







    }

    public static void cleanByBoss() {
        System.out.println("사장 청소 시작");
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println("사장 " + i + " 번방 청소 중");
        }
        System.out.println();
    }

    public static class CleanRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("직원 청소 시작 (Runnable)");
            for (int i = 2; i <= 10; i = i + 2) {
                System.out.println("직원 " + i + " 번방 청소 중");
                try {
                    // 지정 시간 동안 잠시 대기
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println();
        }
    }
}
