import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1 = nums1.length;
        
       
        int b1 = nums2.length;
        
        
        int c1 = a1+ b1;
  
       
        int[] c = new int[c1];
         for (int i = 0; i < a1; i = i + 1) {
           
            c[i] = nums1[i];
        }
  
       
        for (int i = 0; i < b1; i = i + 1) {
  
          
            c[a1 + i] = nums2[i];
        }
        Arrays.sort(c);
        
       
        if(c1%2==0){
            int x = c1/2;
            //double mediann = ;
            return (c[x-1]+c[x])/2.0;
        
        }else  {
           
            double median = c[(c1-1)/2];
            return median;
        }
        
     
  
        
        
    }
}
