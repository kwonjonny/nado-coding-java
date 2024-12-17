package chap_09.array;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * HashSet
 */
public class _06_HashSet {
    public static void main(String[] args) {
        // Set 의 가장 큰 특징은 중복 데이터를 허용하지 않는다
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("음료");
        set.add("소금");
        set.add("상추");
        set.add("깻잎");
        set.add("삼겹살");
        // 데이터 추가후 중복허용이 안돼는지 확인해보자

        System.out.println("총 상품 수: " + set.size());
        for(String s : set) {
            System.out.println(s);
        }
        System.out.println();
        // 또한 Set 은 순서 보장이 되지 않는다

        // 삼겹살이 Set 에 포함 되어 있는지 확인해보자
        if(set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println();

        // 삭제를 해보자
        System.out.println("총 상품 구매 수 (구매 전): " + set.size());
        set.remove("삼겹살");
        System.out.println("총 상품 구매 수 (구매 후): " + set.size());
        System.out.println();

        // 전체 삭제를 해보자
        set.clear();
        if(set.isEmpty()) {
            System.out.println("남은 상품 구매 수: " + set.size());
            System.out.println("집으로 출발");
        }
        System.out.println();

        // Set: 중복도 허용하지 않고 순서도 보장하지 않는다
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);
        intSet.forEach(System.out::println);
        System.out.println();

        // Set 을 쓸때 중복은 허용하지 않돼 순서는 보장해야 하면 LinkedHashSet 이란 것이 있다
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        for(Integer x: linkedHashSet) {
            System.out.println(x);
        }
    }
}
