package chap_09.array;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * HashMap
 */
public class _07_HashMap {
    public static void main(String[] args) {
        // HashMap 은 K , V 쌍으로 이루어진 형태로 이루어져 있다
        // HashMap 은 순서가 보장되지 않는다
        // HashMap 은 Key 의 중복도 허용되지 않는다
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 데이터 추가
        hashMap.put("유재석", 10);
        hashMap.put("박명수", 5);
        hashMap.put("김종국", 3);
        hashMap.put("서장훈", 15);
        System.out.println("총 고객 수: " + hashMap.size());
        System.out.println();

        // 조회 해보자
        System.out.println("유재석님의 포인트: " + hashMap.get("유재석"));
        System.out.println("박명수님의 포인트: " + hashMap.get("박명수"));
        System.out.println();

        // 포인트 확인 해보자
        if(hashMap.containsKey("서장훈")) {
            Integer point = hashMap.get("서장훈");
            hashMap.put("서장훈", ++point);
            System.out.println("서장훈님의 누적 포인트: " + hashMap.get("서장훈"));
        } else {
            hashMap.put("서장훈", 1);
            System.out.println("서장훈님의 신규 등록 (포인트 1)");
        }
        System.out.println();

        // 삭제해보자
        hashMap.remove("유재석");
        // null 반환
        System.out.println(hashMap.get("유재석"));
        System.out.println();

        // 전체삭제 해보자
        hashMap.clear();
        if(hashMap.isEmpty()) {
            System.out.println("남은 고객 수: " + hashMap.size());
            System.out.println("가게 폐업");
        }
        System.out.println();

        // 데이터 추가
        hashMap.put("유재석", 10);
        hashMap.put("박명수", 5);
        hashMap.put("김종국", 3);
        hashMap.put("서장훈", 15);
        for(String key : hashMap.keySet()) {
            System.out.println("key: " + key);
        }


        // Value 확인 --> 하지만 누구의 것인지 확인이 불가능하다
        System.out.println();
        for(Integer value : hashMap.values()) {
            System.out.println("value: " + value);
        }

        System.out.println();

        // Key 와 Value 를 한번에 출력 해보자
        for(String key : hashMap.keySet()) {
            System.out.println("고객 이름: " + key + " 포인트: " + hashMap.get(key));
        }

        System.out.println();

        // 중복 데이터를 허용 하는지 확인해보자
        hashMap.put("김종국", 16);
        hashMap.put("김종국", 15);
        hashMap.put("김종국", 14);
        hashMap.put("김종국", 13);
        hashMap.put("김종국", 12);
        for(String key : hashMap.keySet()) {
            System.out.println("고객 이름: " + key + " 포인트: " + hashMap.get(key));
        }

        // 순서를 보장 하고 싶은 경우에는 ?
        System.out.println();
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("김종국", 1);
        linkedHashMap.put("유재석", 2);
        linkedHashMap.forEach((k, v) -> {
            System.out.println("고객 이름: " + k + " 포인트: " + linkedHashMap.get(k));
        });
    }
}
