//https://www.geeksforgeeks.org/problems/second-largest3735/1

class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int second_largest = -1;
        for(int i=1; i < arr.length; i++){
            if(arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            }else if(arr[i] > second_largest && arr[i] != largest){
                second_largest = arr[i];
            }
        }
        return second_largest;
    }
}
