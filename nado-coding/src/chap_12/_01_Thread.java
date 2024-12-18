package chap_12;

/**
 * 쓰레드
 */
public class _01_Thread {
    public static void main(String[] args) {
        // 실행되어

        // 실행 가능한 것 -> exe 등
        // 실행 된 것 -> Process
        // Process 에서 실제로 작업을 수행하는것을 Thread 라고 한다

        // Process -> 여러개의 Thread 를 가질 수 있다
        // Java 에서는 일반적으로 하나의 Process 가 하나의 Thread를 가진다


        // 혼자 청소하기 힘들다
//        cleanBySelf();

        // 직원을 고용해서 동시에 청소를 진행해보자
        CleanThread cleanThread = new CleanThread();
//        cleanThread.run();
        // 새로운 쓰레드로 동시에 청소를 진행을 시켜보자
        cleanThread.start();
        cleanByBoss();


    }

    public static void cleanBySelf() {
        System.out.println("혼자 청소 시작");
        for(int i = 1; i <= 10; i++) {
            System.out.println("혼자 " + i + " 번방 청소 중");
        }
        System.out.println();
    }

    public static void cleanByBoss() {
        System.out.println("사장 청소 시작");
        for(int i = 1; i <= 10; i = i + 2) {
            System.out.println("사장 " + i + " 번방 청소 중");
        }
        System.out.println();
    }

    public static class CleanThread extends Thread {
        public void run() {
            System.out.println("직원 청소 시작 (Thread)");
            for(int i = 2; i <= 10; i = i + 2) {
                System.out.println("직원 " + i + " 번방 청소 중");
            }
            System.out.println();
        }
    }
}
