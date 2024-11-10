interface check{
    void display();
}

interface check2 extends check{
    void display2();

    default void info(){
        System.out.println("Check");
    }
}


class A{}
class test1 extends A implements check2{
    @Override
    public void display()
    {
        System.out.println("testing interface");
    }

    @Override
    public void display2()
    {
        System.out.println("testing interface from extending");
    }

        @Override
    public String toString(){
        return "this is overridden string";
    }
}

 
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        test1 c1 = new test1() ;
        c1.display();
        c1.display2();
        c1.info();

        //String s1 = "";
        String s1 =c1.toString();
        System.out.println(s1);

    }
}
