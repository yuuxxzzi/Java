import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int input;

        System.out.printf("숫자를 하나 입력하세요. > ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp); // 입력 받은 문자열 (tmp)을 숫자로 변환

        if( input == 0){
            System.out.println("입력 받은 숫자는 0입니다.");
        }
        if (input != 0)
            System.out.println("입력 받은 숫자는 0이 아닙니다.");
            System.out.println("입력 받은 숫자는 0입니다."); // 들여쓰기를 했다고 if문에 들어간다고 착가하지만 아님
    }
}
