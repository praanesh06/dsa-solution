
//https://www.geeksforgeeks.org/problems/next-permutation5226/1

class Solution {
    void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    void nextPermutation(int[] arr) {
        int flag = -1;
        int n = arr.length;
        for(int i=n-1;i>0;--i){
            if(arr[i] > arr[i-1]){
                flag = i-1;
                break;
            }
        }
        
        if(flag == -1){
            reverse(arr, 0, n-1);
            return;
        }
        
        for(int i=n-1;i>0;--i){
            if(arr[i] > arr[flag]){
                int temp = arr[i];
                arr[i] = arr[flag];
                arr[flag] = temp;
                break;
            }
        }
        
        
        reverse(arr, flag+1, n-1);
    }
}
