package chap_09.array;

import java.util.*;

/**
 * Iterator
 */
public class _08_Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("(알 수 없음)");
        list.add("2");
        list.add("(알 수 없음)");
        list.add("3");
        list.add("(알 수 없음)");
        list.add("4");
        list.add("(알 수 없음)");
        // 데이터가 추가 될때 잘못된 Dummy Data 가 들어온다고 가정한다
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println();

        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next()); // 첫번째 값 가져오기
        System.out.println();

        // 계속 추가해줄수 없기 때문에 동적으로 for-each 처럼 순회해야한다
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // 알수없는 Dummy Data 를 삭제 해보자
        iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.contains("(알 수 없음)")) {
                iterator.remove();
            }
        }
        System.out.println();

        // 계속 추가해줄수 없기 때문에 동적으로 for-each 처럼 순회해야한다
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();


        // Iterator 는 Set, Map 에서도 사용 가능하다
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("박명수");
        hashSet.add("유재석");
        Iterator<String> stringIt = hashSet.iterator();
        while (stringIt.hasNext()) {
            System.out.println(stringIt.next());
        }
        System.out.println();

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("유재석", 10);
        hashMap.put("박명수", 20);
        // map.iterator 제공되지 않음
        Iterator<String> itMapKey = hashMap.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println();

        Iterator<Integer> itMapValue = hashMap.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println();

        // K, V 전부 출력해보자
        Iterator<Map.Entry<String, Integer>> iteratorMap = hashMap.entrySet().iterator();
        while (iteratorMap.hasNext()) {
            System.out.println(iteratorMap.next());
        }
    }
}
