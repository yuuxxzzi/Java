public class OperatorEx5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        System.out.printf("%d / %f = %f%n", a, (float)b, a /(float)b);

        // 정수끼리 0으로 나누면 오류가 발생하지만, 실수형끼리는 0으로 나눌 수 있음
        System.out.println("3 / 0.0 = " + 3/0.0);
    }
}
