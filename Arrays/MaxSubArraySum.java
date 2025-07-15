//https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1


class Solution {
    int maxSubarraySum(int[] arr) {
        int curr_sum = arr[0];
        int max_sum = arr[0];
        
        for(int i=1;i<arr.length;i++){
            curr_sum = Math.max(arr[i], max_sum+arr[i]);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }
}
