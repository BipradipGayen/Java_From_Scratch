import java.util.ArrayList;
import java.util.Arrays;
public class arrayelefreq {
    public static void main(String[] args) {
        int arr1 [] = {1,9,7,3,7,8,6,1,1};
        Arrays.sort(arr1); // 111367789
        ArrayList <Integer> arr2 = new ArrayList<>();
        int count = 1;
        for(int i=1;i<arr1.length;i++)
        {
            if(arr1[i]!=arr1[i-1])
            {
                arr2.add(count);
                count =1;
            }
            else{
                count ++;
                
            }
            System.out.printf("%d ",arr1[i]);
            if(i +1 >= arr1.length)
                {
                    arr2.add(count);
                }
             
        }
        for( Integer item:arr2){
            System.out.printf("%d",item);
        }
    }
}
