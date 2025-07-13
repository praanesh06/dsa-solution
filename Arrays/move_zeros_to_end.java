//https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1

// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        int zero_p = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                if(i != zero_p){
                    int temp = arr[i];
                arr[i] = arr[zero_p];
                arr[zero_p] = temp;
                }
                zero_p++;
            }
        }
        
    }
}
