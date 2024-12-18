/*
给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。

请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。

示例 1:
输入: [3,2,1,5,6,4], k = 2
输出: 5

示例 2:
输入: [3,2,3,1,2,4,5,5,6], k = 4
输出: 4
*/

/*
快排
*/
class Solution {
    public int helpfind(int[]nums,int left,int right,int k){
        if(left == right){
            return nums[k];
        }
        int n=nums[left];
        int i=left-1;
        int j=right+1;
        while(i<j){
            while(i<j){
                do{
                    i++;
                }while (nums[i]<n);
                do{
                    j--;
                }while(nums[j]>n);
                if(i<j){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        if(k<=j){
            return helpfind(nums,left, j,k);
        }else{
            return helpfind(nums, j+1,right,k);
        }
    }

    public int findKthLargest(int[] _nums, int k) {
        int n = _nums.length;
        return helpfind(_nums,0,n-1,n-k);
    }
}