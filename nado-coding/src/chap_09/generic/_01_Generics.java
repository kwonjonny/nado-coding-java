package chap_09.generic;

/**
 * 제네릭
 */
public class _01_Generics {
    public static void main(String[] args) {
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println();

        // 제네릭 사용 -> 기본 자료형은 제네릭 타입으로 쓰지 못하므로 Wrapper 클래스의 Integer, Double 을 사용한다
        printGenericArray(iArray);
        printGenericArray(dArray);
        printGenericArray(sArray);
    }

    /**
     * for-each
     * @param sArray String 배열
     */
    private static void printStringArray(String[] sArray) {
        for(String x : sArray) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    /**
     * for-each
     * @param dArray double 배열
     */
    private static void printDoubleArray(Double[] dArray) {
        for(Double x : dArray) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    /**
     * for-each
     * @param iArray int 배열
     */
    private static void printIntArray(Integer[] iArray) {
        for(Integer x : iArray) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // 이 방식은 자료형이 다르면 항상 새로운 메소드를 만들어야한다 그렇기 때문에 제네릭 이란걸 쓰면 편하다

    // 코드의 중복을 없애는 장점이 있다
    /**
     * for-each
     * @param array 제네릭 array
     * @param <T> 요소 Type
     */
    private static <T> void printGenericArray(T[] array) {
        for(T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

}
