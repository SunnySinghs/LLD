public class Main implements Test1, Test2{
    public static void main(String[] args) {
        Test1 test1 = new Main();
        Test2 test2 = new Main();
        System.out.println("Hello world!");
    }
}