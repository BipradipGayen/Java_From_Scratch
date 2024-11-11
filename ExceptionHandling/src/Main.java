import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
         int x =0;
         try
         {
             x=50/0;
             throw new IOException("Idiot");
         }
//         catch (ArithmeticException e)
//         {
//             System.out.printf("error occured \n %s \n",e.getMessage());
//
//         }
         catch (Exception e) {
             System.out.println("got it");
         }

        System.out.println(x);
        System.out.println("bye");
    }
}