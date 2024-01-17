package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받을 수 설정
        System.out.print("입력받을 숫자의 개수를 입력하세요. : ");
        int input = scanner.nextInt();

        // 입력받은 크기만큼 배열 생성
        int[] numbers = new int[input];

        System.out.println(input + "개의 정수를 입력하세요. : ");

        int minValue, maxValue;

        for (int i = 0; i < input; i++) {
            numbers[i] = scanner.nextInt();
        }

        minValue = maxValue = numbers[0];

        for (int number : numbers) {
            minValue = number < minValue ? number : minValue;
            maxValue = number > maxValue ? number : maxValue;
        }

        System.out.println("가장 작은 정수 : " + minValue);
        System.out.println("가장 큰 정수 : " + maxValue);
    }
}
