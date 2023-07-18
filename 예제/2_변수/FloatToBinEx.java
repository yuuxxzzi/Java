public class FloatToBinEx {
    public static void main(String[] args) {
        float f = 9.1234567f;
        //floatToIntBits() : float타입의 값을 int타입의 값으로 해석해서 반환
        int i = Float.floatToIntBits(f);

        System.out.printf("%f%n", f);
        System.out.printf("%X%n", i); // 실수가 저장되는 방식을 보여줌

    }
}
