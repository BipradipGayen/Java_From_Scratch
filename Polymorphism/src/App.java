//Runime polymorphism

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ClassB obj2 = new ClassB();
        ClassC obj3 = new ClassC();
        ClassD obj4 = new ClassD();
        obj4.printAll(obj2);
        obj4.printAll(obj3);
    }
}
