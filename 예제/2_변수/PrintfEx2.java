public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "https://github.com/yuuxxzzi/Java";

        float f1 = .10f; // 0.10. 1.0e-1
        float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f; //3140
        double d = 1.23456789;

        // %g : 간략하게 출력할 때 사용
        // %f : 기본적으로 소수점 6자리까지만 출력, 7자리에서 반올림
        System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);

        System.out.printf("d = %f%n", d); // 마지막 자리 반올림됨
        System.out.printf("d = %14.10f%n", d); // 전체 14자리 중 소수점 10자리

        System.out.printf("[1234567890123456789012345678901234567890]%n");
        System.out.printf("[%s]%n",url);
        System.out.printf("[%40s]%n",url);
        System.out.printf("[%-40s]%n",url);
        System.out.printf("[%.8s]%n",url); // 왼쪽에서 8글자만 출력
        System.out.printf("[%15.8s]%n",url); // 15칸에서 8글자만 출력하는데 오른쪽 정렬




    }
}
