package chap_10.converter.service;

public class KRWConverter implements Convertible {
    @Override
    public void convert(Integer USD) {
        System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
    }
}
