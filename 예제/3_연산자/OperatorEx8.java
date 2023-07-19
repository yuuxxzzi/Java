public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        // 결과 값이 int타입의 값이므로 long 형으로 자동 형 변환되어도 값은 변하지 않음
        long c = a*b; // long c = (long)a*b;

        System.out.println(c);
    }
}
