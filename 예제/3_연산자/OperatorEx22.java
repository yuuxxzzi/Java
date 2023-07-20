public class OperatorEx22 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.printf("10.0 == 10.0f   %b%n", 10.0 == 10.0f);
        System.out.printf("0.1 == 0.1f   %b%n", 0.1 == 0.1f);
        System.out.printf("f = %19.17f%n", f); // 0.1f를  저장하기 위해서 2진수로 변환하는 과정에서 오차 발생
        System.out.printf("d = %19.17f%n", d);
        System.out.printf("d2 = %19.17f%n", d2);
        System.out.printf("d == f   %b%n", d == f );
        System.out.printf("d == d2   %b%n", d == d2 );
        System.out.printf("d2 == f   %b%n", d2 == f );
        System.out.printf("(float)d == f   %b%n", (float)d == f );

    }
}
