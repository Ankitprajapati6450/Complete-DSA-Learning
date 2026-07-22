class Solution {
    public void Reverse(int nums[], int i, int j){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
          int size = nums.length;
          k = k % size;
          Reverse(nums , 0 , size - 1);
          Reverse(nums , 0 , k - 1);
          Reverse(nums , k , size - 1);
    }
};
