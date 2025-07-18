//https://www.geeksforgeeks.org/problems/reverse-an-array/1


class Solution {
    public void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
