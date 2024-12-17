package chap_10.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream
 */
public class _05_Stream {
    public static void main(String[] args) {
        // 데이터가 흐른다는 표현의 Stream

        // 다양한 방식의 스트림 객체 만드는법

        // Array.Stream
        Integer[] scores = {100, 20, 32, 43, 55, 90, 95, 96, 97};
        Stream<Integer> scoreStream = Arrays.stream(scores);

        String[] languages = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(languages);

        // Collection.Stream
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        System.out.println("Stream Size: " + langList.size());
        System.out.println();

        Stream<String> lantListStream = langList.stream();

        // Stream.of
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");


        // 스트림을 사용해보자
        // 스트림은 중간 연산 (Intermediate Operation): filter, map, sorted, distinct, skip
        // 최종 연산 (Terminal Operation): count, min, max, sum, foreach, anyMatch, allMatch 등 등

        // 90 점 이상인 점수만 출력
        Arrays.stream(scores)
                .filter(x -> x >= 90)
                .forEach(x -> System.out.println(x));
        System.out.println();


        Arrays.stream(scores)
                .filter(x -> x >= 90)
                .forEach(System.out::println);
        System.out.println();


        // 90 점 이상인 사람의 수
        long count = Arrays.stream(scores)
                .filter(x -> x >= 90)
                .count();
        System.out.println("count: " + count);


        // 90 점 이상인 사람의 점수의 합
        System.out.println();
        int sum = Arrays.stream(scores)
                .filter(x -> x >= 90)
                .mapToInt(x -> x)
                .sum();
        System.out.println("sum: " + sum);


        // 90 점 이상인 사람들을 정렬
        System.out.println();
        List<Integer> sorted = Arrays.stream(scores)
                .filter(x -> x >= 90)
                .sorted()
                .toList();
        sorted.forEach(System.out::println);


        // 문자열로 처리해보자 이제
        // C 로 시작하는 프로그래밍 언어
        System.out.println();
        List<String> lanStream = Arrays.stream(languages)
                .filter(c -> c.startsWith("c"))
                .toList();
        lanStream.forEach(System.out::println);


        // Java 라는 글자를 포함하는 언어
        System.out.println();
        List<String> javaStream = Arrays.stream(languages)
                .filter(x -> x.contains("java"))
                .toList();
        javaStream.forEach(System.out::println);


        // 글자 길이가 4 글자 이하의 언어를 정렬해서 출력
        System.out.println();
        List<String> cJavaStream = Arrays.stream(languages)
                .filter(x -> x.length() <= 4)
                .sorted()
                .toList();
        cJavaStream.forEach(System.out::println);


        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어
        System.out.println();
        List<String> cContainsStream = Arrays.stream(languages)
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .sorted()
                .toList();
        cContainsStream.forEach(System.out::println);


        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어가 하나라도 있는지 여부
        System.out.println();
        Boolean anyMatch = Arrays.stream(languages)
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);


        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어가 모두 있는지 여부
        System.out.println();
        Boolean allMatch = Arrays.stream(languages)
                .filter(x -> x.length() <= 4)
                .allMatch(x -> x.contains("c"));
        System.out.println(allMatch);


        // 4글자 이하의 언어들 중에서 c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        // 이럴때 사용할 수 있는 것이 map
        System.out.println();
        List<String> hardList = langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + " (어려워요)")
                .toList();
        hardList.forEach(System.out::println);


        // c 라는 글자를 포함하는 언어를 대문자로 출력
        System.out.println();
        List<String> list = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .toList();
        list.forEach(System.out::println);

    }
}
