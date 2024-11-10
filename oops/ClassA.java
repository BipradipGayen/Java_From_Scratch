// package oops;

public class ClassA {
    public static void main(String[] args) {
        Person p1=  new Person(); 
        Person p2=  new Person(); 
        p2.id = p1.id;

        
        p1.Displaydata();
        p1.Displaydata(true);
        //int x= p1.Displaydata(10);
        System.out.println(p2.id);
    }
    
}
