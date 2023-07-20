public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

//      char c2 = c1 + 1; // 오류발생
        char c2 = 'a' + 1; //컴파일러가 미리 뎃셈 연산수 변수에 c2에 저장

        System.out.println(c2);

    }
}
