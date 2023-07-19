public class CastingEx3 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double)f;

        double d3 = 1.0e100;
        float f3 = (float)d3;

        double d4 = 1.0e-50;
        float f4 = (float)d4;

        System.out.printf("f = %20.18f%n", f);
        System.out.printf("d = %20.18f%n", d);
        System.out.printf("d2 = %20.18f%n", d2);

        // float 타입의 범위를 넘는 값을 형변환
        // 최대값보다 크면 +무한대 or - 무한대
        System.out.printf("f3 = %20.18f%n", f3);
        // 최소값보다 작으면 0
        System.out.printf("f4 = %20.18f%n", f4);
    }
}
