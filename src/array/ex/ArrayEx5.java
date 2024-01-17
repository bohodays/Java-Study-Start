package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받을 수 설정
        System.out.print("입력받을 숫자의 개수를 입력하세요. : ");
        int input = scanner.nextInt();

        // 입력받은 크기만큼 배열 생성
        int[] numbers = new int[input];

        System.out.println(input + "개의 정수를 입력하세요. : ");

        int total = 0; // 합을 구하기 위한 변수 설정

        for (int i = 0; i < input; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        double avg = (double) total / input;
        System.out.println("입력한 정수의 합계 : " + total);
        System.out.println("입력한 정수의 평균 : " + avg);

    }
}
