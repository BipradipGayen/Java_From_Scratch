import java.util.*;
import java.util.Collection.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        int result =0 ;
//        for ( int i : l)
//        {
//            if(i%2 != 0)
//            {
//                result+= i;
//            }
//        }

        // using stream apis
        //sum of all odd values
        //result = l.stream().filter(n-> n%2 !=0 ).reduce(0,(a,b) -> a+b);

        //sum of all nos in a list
       // result = l.stream().reduce(0,(a,b) -> a+b);

        //Stream<Integer> l2 = l.stream().filter(n-> n%2!=0);
        Stream<Integer> l2 = l.stream().map(n-> n+1);

        System.out.println(l2.toList());
    }
}