class Solution {
    public int findMin(int[] nums) {
        insertion(nums);
        return nums[0];

    }
    static void insertion(int[] arr){
            for( int i = 0; i< arr.length - 1; i++){
                for (int j = i+1; j>0; j--) {
                    if(arr[j]<arr[j-1]){
                        swap(arr, j, j-1);
    
                    }else{
                        break;
                    }
                }
            }
          }
      
    static void swap(int[] arr, int first, int sec ){
            int temp = arr[first];
            arr[first] = arr[sec];
            arr[sec] = temp;
        }
}
