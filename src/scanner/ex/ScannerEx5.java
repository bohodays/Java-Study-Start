package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        int minValue = num1 < num2 ? num1 : num2;
        int maxValue = num1 > num2 ? num1 : num2;

        System.out.print("두 숫자 사이의 모든 정수 : ");
        for (int i = minValue; i <= maxValue; i++) {
            System.out.print(i);
            if (i != maxValue) {
                System.out.print(", ");
            }
        }
    }
}
