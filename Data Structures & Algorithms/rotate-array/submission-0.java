class Solution {
    public void reverse(int[] nums, int st,int end){
        while(st<end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int remaining = n-k;
        reverse(nums,remaining,n-1);
        reverse(nums,0,remaining-1);
        reverse(nums,0,n-1);
    }
}