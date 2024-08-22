class Solution {
    public int trailingZeroes(int n) {
        int count=0,val=5;
        while(n>=val){
           count+=n/val;
           val*=5;
        }
        return count;
    }
}
