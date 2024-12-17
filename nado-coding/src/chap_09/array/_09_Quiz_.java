package chap_09.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 퀴즈9: ArrayList 를 이용하여 학생별 프로그래밍 언어 자격증 취득 정보를 관리하고, 자바 자격증을 보유한 학생 이름을 출력하시오
 *
 * 조건:
 * - 학생 이름 및 자격증 취득 정보를 위한 StudentClass 생성
 * - 학생 1인당 보유 자격증은 1개로 제한
 * - 모든 클래스는 하나의 파일에 정의
 */
public class _09_Quiz_ {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("유재석", "파이썬"));
        studentList.add(new Student("박명수", "자바"));
        studentList.add(new Student("김종국", "자바"));
        studentList.add(new Student("조세호", "C"));
        studentList.forEach(str -> {
            if(str.getProgrammingLanguage().equals("자바")) {
                System.out.println(str);
            }
        });
    }

    public static class Student {
        private final String name;
        private final String programmingLanguage;

        public Student(String name, String programmingLanguage) {
            this.name = name;
            this.programmingLanguage = programmingLanguage;
        }

        public String getProgrammingLanguage() {
            return programmingLanguage;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "자격증 보유 상태 성명: " + name + " 자격증: " + programmingLanguage;
        }
    }
}