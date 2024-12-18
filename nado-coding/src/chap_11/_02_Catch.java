package chap_11;

/**
 * Catch
 */
public class _02_Catch {
    public static void main(String[] args) {

        // Exception 은 다른 예외의 조상 클래스
        try {
//            System.out.println(3 / 0);


//            int[] arr = new int[3];
//            arr[4] = 4;


//            Object object = "test";
//            System.out.println((int) object);

            String s = null;
            System.out.println(s.toLowerCase());
        } catch (ClassCastException e) {
            throw new RuntimeException("Class Cast Exception: " + e.getMessage());


//        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new RuntimeException("Array Exception: " + e.getMessage());


        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Arithmetic Exception: " + e.getMessage());


        } catch (Exception e) {
            throw new RuntimeException("Exception: " + e.getMessage());
        }
    }
}
