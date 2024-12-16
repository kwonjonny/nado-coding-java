package chap_09.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ArrayList
 */
public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크
        int[] array = new int[3];
        // 배열은 크기가 고정되기 때문에 동적으로 할당하기가 매우 어렵다

        // List, Set, Map 이 대표적인 컬렉션 프레임워크다
        List<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");
        // 0번 Index 에 해당하는 것 --> 유재석
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println();

        // 박명수를 삭제해보자
        list.remove("박명수");
        list.forEach(System.out::println);
        System.out.println("After Remove Size: " + list.size());
        System.out.println(list.get(3));
        System.out.println();

        System.out.println("남은 학생 수 (제외 전): " + list.size());
        list.remove(list.size() -1); // 맨 마지막 학생을 삭제해보자
        System.out.println("남은 학생 수 (제외 후): " + list.size());
        System.out.println();

        // for - each 로 나머지 Array 를 확인한다
        list.forEach(System.out::println);
        System.out.println();

        // 리스트 데이터를 변경해보자 수강권을 양도한다 --> 이수근
        // 양도 전
        list.forEach(System.out::println);
        System.out.println();
        list.set(0, "이수근");
        list.forEach(System.out::println);

        System.out.println();
        // 선착순 목록에 포함되어 있는지 확인한다
        System.out.println(list.indexOf("김종국"));
        // 선착순 5명 내에 포함되어 있는가?
        if(list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println();
        // 전체 삭제해보자
        list.clear();
        boolean isEmpty = list.isEmpty();
        System.out.println("리스트가 비었습니다. " + isEmpty);
        System.out.println();


        // 다음 학기에 새로운 시작을 해보자
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");
        // 이름순으로 정렬해보자 --> Collections.sort 활용
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
