package method.ex;

public class MethodEx1Ref {

    public static void main(String[] args) {
        avg(1, 2, 3);
        avg(15, 25, 35);
    }

    public static void avg(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        double avg = sum / 3.0;
        System.out.println("평균값 : " + avg);
    }
}
