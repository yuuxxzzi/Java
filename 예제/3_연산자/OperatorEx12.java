public class OperatorEx12 {
    public static void main(String[] args) {
        char c1 = 'a'; // c1에는 a의 값인 97이 저장
        char c2 = c1;
        char c3 = ' '; // 공백으로 초기화

        int i = c1 + 1; // 97 + 1

        c3 = (char)(c1 + 1);
        c2++;
        c2++;

        System.out.println("i = " + i);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

    }
}
