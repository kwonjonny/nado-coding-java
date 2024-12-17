package chap_10.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * 퀴즈10: 스트림을 이용하여 미술관 방문 손님에게 적절한 입장료를 안내하는 프로그램을 작성하시오
 * <p>
 * 조건:
 * - 손님 이름 및 나이 정보를 위한 Customer Class 생성
 * - 입장료는 1인당 5000원으로 고정
 * - 20세 이상의 손님들에게만 입장료 부과 (그 외에는 무료)
 * - 모든 클래스는 하나의 파일에 정의
 */
public class _06_Quiz {

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("챈들러", 50));
        customerList.add(new Customer("레이철", 42));
        customerList.add(new Customer("모니카", 21));
        customerList.add(new Customer("벤자민", 18));
        customerList.add(new Customer("제임스", 5));

//        customerList.forEach(str -> {
//            if (str.getAge() >= 20) {
//                System.out.println(str.getName() + " 무료");
//            } else {
//                System.out.println(str.getName() + " 5000원");
//            }
//        });


        List<String> customers = customerList.stream()
                .map(x -> x.getAge() > 20 ? x.getName() + " 5000원" : x.getName() +  " 무료")
                .toList();
        customers.forEach(System.out::println);
    }

    public static class Customer {
        private final String name;
        private final Integer age;

        public Customer(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
}
