package chap_09;

/**
 * 제네릭 클래스
 */
public class _02_GenericClass {
    public static void main(String[] args) {

        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickName c2 = new CoffeeByNickName("유재석");
        c2.ready();

        System.out.println();

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println();
        Integer c3Name = (Integer) c3.name;
        System.out.println("주문 고객 번호: " + c3Name);
        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름: " + c4Name);

        // 실수로 이름을 잘못 넣으면? --> 형 변환의 어려움 및 유지보수의 어려움이 있다
        // c4Name = (String) c3.name;
        // System.out.println(c4Name);

        System.out.println();

        // 이때 쓸수 있는게 제네릭 클래스 Wrapper 클래스 사용
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        Integer c5Name = c5.getName();
        System.out.println("주문 고객 번호 : " + c5Name);

        System.out.println();


        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.getName();
        System.out.println("주문 고객 이름: " + c6Name);

        System.out.println();

        CoffeeByUser<User> c7 = new CoffeeByUser<User>(new User("강호동"));
        c7.ready();

        System.out.println();

        CoffeeByUser<User> c8 = new CoffeeByUser<User>(new VIPUser("서장훈"));
        c8.ready();

        System.out.println();

        orderCoffee("김영철");
        orderCoffee(36);

        System.out.println();

        orderCoffee("김희철", "americano");
        orderCoffee(37, "latte");
    }

    // 매번 클래스를 만드는 불편함이 있다
    private static class CoffeeByNumber {
        private final Integer waitingNumber;

        public CoffeeByNumber(Integer waitingNumber) {
            this.waitingNumber = waitingNumber;
        }

        public void ready() {
            System.out.println("Coffee Is Ready: " + waitingNumber);
        }
    }

    private static class CoffeeByNickName {
        private final String nickName;

        public CoffeeByNickName(String nickName) {
            this.nickName = nickName;
        }

        public void ready() {
            System.out.println("Coffee Is Ready: " + nickName);
        }
    }

    // Object 로 불편함을 줄여보자 --> 자료형을 모르면 유지보수가 어렵지 않을까 ?
    private static class CoffeeByName {
        private Object name;

        public CoffeeByName(Object name) {
            this.name = name;
        }

        public void ready() {
            System.out.println("Coffee Is Ready: " + name);
        }
    }

    // 제네릭 클래스로 활용을 바꿔보자
    private static class Coffee <T> {
        private final T name;

        public Coffee(T name) {
            this.name = name;
        }

        public T getName() {
            return name;
        }

        public void ready() {
            System.out.println("Coffee Is Ready: " + name);
        }
    }

    // User 라는 클래스를 상속하는 Type 을 사용할수있다 VIPUser, User 와 같은 클래스
    private static class CoffeeByUser<T extends User> {
        private final T user;

        public CoffeeByUser(T user) {
            this.user = user;
        }

        public void ready() {
            System.out.println("Coffee Is Ready: " + user.getName());
            user.addPoint();
        }
    }

    // User 로 클래스를 관리 해보자
    private static class User {
        private final String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void addPoint() {
            System.out.println(this.name + "님, 포인트 적립 되었습니다.");
        }
    }

    // VIP 도 관리해보자
    private static class VIPUser extends User {
        public VIPUser(String name) {
            super("특별한 " + name);
        }
    }

    // 제네릭 메소드를 활용 해보자
    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료: " + name);
    }

    // T, V 로 값을 여러개로 파라미터를 받아보자
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료: " + name);
    }
}
