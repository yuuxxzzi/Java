public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작되었음");
        firstMethod(); // static 메소드는 객체 생성없이 호출 가능
        System.out.println("main(String[] args)이 끝났음");
    }

    static void firstMethod(){
        System.out.println("firstMethod()가 시작되었음");
        secondMethod();
        System.out.println("firstMethod()가 끝났음");
    }
    static void secondMethod(){
        System.out.println("secondMethod()가 시작되었음");
        System.out.println("secondMethod()가 끝났음");
    }
}
