//Unoptimized solution - only use as a starting reference

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        

        int[] merged_array = new int[m + n];
        System.arraycopy(nums1, 0, merged_array, 0, nums1.length);
        System.arraycopy(nums2, 0, merged_array, m, nums2.length);

        //bubble sort
        for (int i=0; i<merged_array.length-1; i++) {

            //these index positions creates a couple redundant checks
            for (int j=0; j<(merged_array.length)-1; j++) {


                //if the elment to the right is less than the current index
                if (merged_array[j+1]<merged_array[j]) {

                    
                    int temp = merged_array[j];
                    merged_array[j] = merged_array[j+1];
                    merged_array[j+1] = temp;

                }

            }//for loop - j
        }//for loop - i

        System.arraycopy(merged_array, 0, nums1, 0, merged_array.length);

    }//merge function
}
