package chap_12;

/**
 * Join
 */
public class _03_Join {
    public static void main(String[] args) {
        _02_Runnable.CleanRunnable cleanRunnable = new _02_Runnable.CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            // 쓰레드가 종료 될때까지 기다렸다가 cleanByBoss 호출
            thread.join(2500); // 2.5 초 대기 후 다음
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("사장 청소 시작");
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println("사장 " + i + " 번방 청소 중");
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
