import java.util.*;
class switchTest{
    public static void main(String[] args) {
        System.out.println("Enter your choice");
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        switch (n)
        {
            case 1 -> System.out.println("case1");
            case 2 ->  System.out.println("case2");
            default -> System.out.println("do nothing");
        }
    }
}