package chap_10.converter.service;

@FunctionalInterface
public interface ConvertibleWithReturn {
    String convert(Integer USD, Integer KRW);
}
