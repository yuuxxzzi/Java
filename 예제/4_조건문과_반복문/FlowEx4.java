import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.printf("점수를 입력하세요. >");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if(score >= 90){
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70 ){
            grade = 'C';
        }else{
            grade = 'D';
        }
        System.out.printf("당신의 학점은 %c 입니다.", grade);
    }
}
