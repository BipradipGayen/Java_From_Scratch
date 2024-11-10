
class removeDuplicates{
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,2,3,4,4};

        int count =0;
        int j=1;
        for ( int i =1 ; i < nums.length ; i++)
        {
            if( nums[i] != nums[i-1] )
            {
                nums[j] = nums[i];
                j++;
            }
        }

        System.out.printf("%d \n",count);
        for (int each : nums) {
            System.out.printf("%d",each);

        }

    }
}