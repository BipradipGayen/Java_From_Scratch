public class pallindrome{
    public static void main(String [] args)
    {
        int number = 454,a,b=0;
        for (;number>0;)
        {
            a=number %10;
            b=b*10+a;
            number=number/10;
        }
        if(b == 455)
        {
            System.out.printf("pallindorme");
        }
        else{
            System.out.println("not");
        }
    }
}