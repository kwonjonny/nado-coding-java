package chap_10.converter;

import chap_10.converter.service.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter krwConverter = new KRWConverter();
        krwConverter.convert(1);
        System.out.println();

        // 간단하게 처리해보자
        convertUSD(krwConverter, 1);
        System.out.println();

        // 람다식으로 처리해보자
        convertUSD(USD -> {
            System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        }, 2);
        System.out.println();

        Convertible convertible = (USD -> {
            System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        });
        convertUSD(convertible, 12);

        System.out.println();
        // 전달값이 하나도 없다면 ?
        ConvertibleWithNoParams c1 = () -> System.out.println("2 달러 = 2800원");
        c1.convert();

        System.out.println();
        // 두 줄 이상 코드가 있다면?
        c1 = () -> {
          Integer USD = 5;
          Integer KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();


        System.out.println();
        // 전달값이 두개 이상인 경우?
        ConvertibleWithTwoParams c2 = (USD, KRW) -> {
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c2.convert(10, 1400);


        // 반환값이 있는 경우?
        System.out.println();
        ConvertibleWithReturn c3 = (USD, KRW) -> {
            return USD + " 달러 = " + (USD * KRW) + " 원" ;
        };
        String result = c3.convert(20, 1400);
        System.out.println(result);
    }

    // 메인 메소드 밑에 새로운 메소드를 만들어 처리해보자
    public static void convertUSD(Convertible converter, Integer USD) {
        converter.convert(USD);
    }
}
