class Solution {
    public void move(int nums[],int n,int m){
        for(int i=n+1;i<m;i++)
           nums[i-1]=nums[i];
    }
    public int removeDuplicates(int[] nums) {
        int k=nums.length;
        int n=10001,count=1;
        for(int i=0;i<k;i++){
           if(n!=nums[i]){
            count=1;
            n=nums[i];
           }
           else if(count==2){
               move(nums,i,k);
               k--;
               i--;
           }
           else
             count++;
        }
        return k;
    }
}
