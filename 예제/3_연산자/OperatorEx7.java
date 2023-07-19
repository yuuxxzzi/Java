public class OperatorEx7 {
    public static void main(String[] args) {
        byte a =10;
        byte b = 30;
        byte c = (byte)(a*b);
        // 원래 c값은 300이 옳지만 byte 형의 범위를 벗어나기 때문에 범위 중 한 값을 가지게됨
        System.out.println(c);
    }
}
