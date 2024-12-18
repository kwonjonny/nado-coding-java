package chap_12;

/**
 * 동기화
 */
public class _05_Synchronization {
    public static void main(String[] args) {
        Room room = new Room();

        Runnable clean1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("직원1 청소 시작");
                for (int i = 1; i <= 5; i++) {
                   room.clean("직원1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if(i == 2) {
                        throw new RuntimeException("청소 너무 힘들어");
                    }
                }
                System.out.println();
            }
        };

        Runnable clean2 = () -> {
            System.out.println("직원2 청소 시작");
            for (int i = 1; i <= 5; i++) {
               room.clean("직원2");

                try {
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

        //  직원이 무작위로 1번방을 동시에 청소할수있다 -> 이떄 필요한것이 동기화이다
    }

    public static class Room {
        public int number = 1;

        // 동기화 처리
        synchronized public void clean(String name) {
            System.out.println(name + " : " + number + " 번방 청소 중");
            number++;
        }
    }
}
