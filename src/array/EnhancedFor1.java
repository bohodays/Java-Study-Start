package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("number = " + number);
        }

        // 향상된 for문, for-each문
        // index 값이 필요한 경우에는 사용할 수 없음
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
    }
}
