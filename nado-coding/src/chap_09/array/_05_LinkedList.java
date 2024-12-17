package chap_09.array;

import java.util.Collections;
import java.util.LinkedList;

/**
 * LinkedList
 */
public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트는 모든 데이터들이 선으로 연결되어있다
        LinkedList<String> list = new LinkedList<>();
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스 기준)
        System.out.println(list.get(0));
        System.out.println();

        // LinkedList 는 편하게 조회하는 방법이 있다
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // 추가 하는 방법 --> 유재석 앞으로 추가
        list.addFirst("서장훈");
        System.out.println();
        for(String s : list) {
            System.out.println(s);
        }

        System.out.println();
        list.addLast("김희철");
        for(String s : list) {
            System.out.println(s);
        }


        // 중간 위치에 데이터를 삽입해보자 --> ArrayList LinkedList 모두 사용 가능
        // 노드의 사이에 기존의 1인 index 를 뒤로 미루고 삽입하게 된다
        System.out.println();
        System.out.println("학생 추가 전: " + list.get(1));
        list.add(1, "김영철");
        for(String s : list) {
            System.out.println(s);
        }
        System.out.println("학생 추가 후: " + list.get(2));
        System.out.println();

        // 값을 삭제 해보자
        System.out.println("남은 학생 수 (제외 전): " + list.size());
        list.remove(list.size() -1);
        System.out.println("남은 학생 수 (제외 후): " + list.size());


        System.out.println();
        System.out.println("전학 전 학생 수: " + list.size());
        // 처음 학생과 마지막 학생이 전학을 가게 되엇다
        list.removeFirst(); // 처음 데이터 삭제
        list.removeLast(); // 마지막 데이터 삭제
        System.out.println("전학 후 학생 수: " + list.size());
        System.out.println();

        for(String x : list) {
            System.out.println(x);
        }
        System.out.println();
        // 변경 수강권 양도 해보자
        list.set(0, "이수근");
        System.out.println(list.get(0));
        System.out.println();

        // 확인 해보자
        System.out.println(list.indexOf("김종국"));
        if(list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }
        System.out.println();

        // 학기가 끝났으므로 전체 삭제를 해보자
        list.clear();
        if(list.isEmpty()) {
            System.out.println("학생 수: " + list.size());
            System.out.println("리스트가 비어있음");
        }
        System.out.println();

        // 새로운 학기가 시작되어
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");
        // 정렬을 시작해 이름순으로 오름차순 정렬한다
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
