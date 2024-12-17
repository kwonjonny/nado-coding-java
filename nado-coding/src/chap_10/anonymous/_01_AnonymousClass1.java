package chap_10.anonymous;

/**
 * 익명 클래스
 */
public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        Coffee c1 = new Coffee("라떼");
        c1.order();
        c1.returnTray();
        System.out.println();

        Coffee c2 = new Coffee("아메리카노");
        c2.order();
        c2.returnTray();
        System.out.println();

        // 예를들어 친한 손님이 방문을 했을때 익명 클래스로 전환할수있다
        // 익명 클래스는 기능의 확장이 필요할때 주로 사용한다
        Coffee special = new Coffee("바닐라 라떼") {
            @Override
            public void order() {
                super.order();
                System.out.println("(귓속말) 딸기 케이크는 서비스에요.");
            }

            @Override
            public void returnTray() {
                System.out.println("(귓속말) 자리에 두시면 제가 치울게요.");
            }
        };
        special.order();
        special.returnTray();

    }
}

class Coffee {

    private final String coffee;

    public Coffee(String coffee) {
        this.coffee = coffee;
    }

    public void order() {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray() {
        System.out.println("다드신 " + coffee + "는 카운터로 가져와주세요.");
    }
}
