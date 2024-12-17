package chap_10.converter.service;

/**
 * 함수형 인터페이스 컴파일러에게 어노테이션으로 알려준다
 */
@FunctionalInterface
public interface Convertible {
    void convert(Integer USD);
}
