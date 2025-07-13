//https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1


class Solution {
    
    static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        d = d% arr.length;
       reverse(arr, 0, d-1);
       reverse(arr, d, arr.length-1);
       reverse(arr, 0, arr.length-1);
    }
}
