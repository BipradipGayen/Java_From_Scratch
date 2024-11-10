// package oops;
public class Person {
    
    int id =1;
    String name = "Ram";
    int roll = 43;

    public void Displaydata()
    {
        System.out.printf("name is %s , with id %d and roll %d",name,id,roll);
    }
    public void Displaydata(boolean val)
    {
        System.out.println("\n This is overloaded func 1");
    }

    public int Displaydata(int val)
    {
        System.out.println("\n This is overloaded func2");
        return 10;
    }
}
