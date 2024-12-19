package chap_13;

import java.util.Scanner;

/**
 * 입력 Input
 */
public class _01_Input {

    public static void main(String[] args) {
        // 사용자가 입력
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Your Name");
        String name = scan.next();

        System.out.println("Input Your Blood Type");
        String bloodType = scan.next();

        System.out.println("Input Your Height");
        Integer height = scan.nextInt();

        System.out.println("Input Your Weight");
        Double weight = scan.nextDouble();

        System.out.println("Your Info");
        System.out.println("name: " + name);
        System.out.println("bloodType: " + bloodType);
        System.out.println("Height: " + height);
        System.out.println("weight: " + weight);

    }

}
