public class fibonac {
    public static void main(String[] args) {
        int length = 5;
        int a=0,b=1,c;
        System.out.printf("%d%d",a,b);
        while (length-- >0)
        {
            c = a+b;
            a=b;
            b=c;
            System.out.printf("%d",c);
        }
    }
}
