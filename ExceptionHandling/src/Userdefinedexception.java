class MyException extends Exception{
    MyException(String message)
    {
        super(message);
    }
}

public class Userdefinedexception {
    public static void main(String[] args) {
    int x=0;
    try
    {
        //x=10/0;
        throw new MyException("idiot");
    }
    catch (MyException e)
    {
        System.out.printf("exception got %s",e.getMessage() );
    }
    }
}
