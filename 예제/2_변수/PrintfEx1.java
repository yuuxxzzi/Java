public class PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L; // long big = 1000000000000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;// 8진수 10, 10진수 8
        int hexNum = 0x10; // 16진수 10, 10진수로 16
        int binNum = 0b10; // 2진수 10, 10진수 2

        System.out.printf("b = %d%n", b);
        System.out.printf("s = %d%n", s);
        System.out.printf("c = %c, %d %n", c , (int)c);
        System.out.printf("finger = [%5d]%n",finger); // 오른쪽 정렬
        System.out.printf("finger = [%-5d]%n",finger); //-가 붙은 경우 :  왼쪽 정렬
        System.out.printf("finger = [%05d]%n",finger); // 오른쪽 정렬, 빈 공간은 0으로 채워라
//      System.out.printf("finger = [%*5d]%n",finger); //다른 걸 넣었을 때 되는지 확인 했을 때 오류가 뜨는 것을  확인 가능
        System.out.printf("big = %d%n",big);
        System.out.printf("hex = %#x %n",hex); // '#'은 접두사 (16진수 0x, 8진수 0)
        System.out.printf("hex = %x %n",hex);
        System.out.printf("OctNum = %o, %d %n",octNum, octNum);
        System.out.printf("hexNum = %x, %d %n",hexNum, hexNum);
        System.out.printf("binNum = %s, %d %n",Integer.toBinaryString(binNum), binNum);






    }
}
