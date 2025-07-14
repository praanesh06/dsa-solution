//https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1


class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        
        int diff = arr[n-1] - arr[0];
        
        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;
        
        for(int i=0;i<n-1;i++){
            int min = Math.min(smallest, arr[i+1]-k);
            int max = Math.max(largest, arr[i]+k);
            
            if(min < 0) continue;
            
            diff = Math.min(diff, max-min);
        }
        return diff;
    }
}
