public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
//        byte c = a + b; <- 이렇게 하면 오류남
        byte c = (byte)(a+b); //명시적인 형변환이 필요
        System.out.println(c);
    }
}
