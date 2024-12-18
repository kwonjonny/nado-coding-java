package chap_11;

import java.io.BufferedWriter;

/**
 * Try - With - Resources
 */
public class _05_TryWithResources {
    public static void main(String[] args) {
        // EX: DB Connection 을 닫아야 할때 쓰는 경우 이다

        MyFileWriter writer = null;
        try {
            writer = new MyFileWriter();
            writer.write("아이스크림이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println();

        // 자동으로 close 를 호출하게끔 해준다
        // AutoCloseable Interface 를 구현해야만 된다
        try(MyFileWriter writer2 = new MyFileWriter()) {
            writer2.write("빵이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용: " + line);
    }
}
