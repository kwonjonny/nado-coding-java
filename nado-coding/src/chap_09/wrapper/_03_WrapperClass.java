package chap_09.wrapper;

/**
 * Wrapper 클래스
 */
public class _03_WrapperClass {
    public static void main(String[] args) {

       // 기본 자료형을 int, double, float, char, boolean 을 클래스 형태로 대입하는것
        Integer i = 123;
        Double d = 1.0;
        Character c = 'A';
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println();

        // Wrapper 클래스는 클래스이기 때문에 기능을 제공해준다
        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());

        System.out.println();

        // 정수를 문자형으로 변경
        String s = i.toString();
        System.out.println(s);
    }
}
