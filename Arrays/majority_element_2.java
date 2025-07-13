//https://www.geeksforgeeks.org/problems/majority-vote/1

class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : arr){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num)+1);
            }
        }
        ArrayList<Integer> majority = new ArrayList<>();
        
        ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        
        for(int key: sortedKeys){
            if(map.get(key) > arr.length/3){
                majority.add(key);
            }
        }
        return majority;
    }
}
