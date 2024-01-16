package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // 변수 m 생존 시작

        if (true) {
            int x = 20; // 변수 x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // 변수 x 생존 종료
        // System.out.println("main x = " + x); 에러 발생
        System.out.println("if m = " + m);
    } // 변수 m 생존 종료
}
