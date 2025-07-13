#https://www.geeksforgeeks.org/problems/majority-vote/1

class Solution:
    def findMajority(self, arr):
        occurence = {}
        for num in arr:
            if num not in occurence:
                occurence[num] = 1
            else:
                occurence[num] += 1
        
        majority = []
        occurence_sorted = sorted(occurence.items())
        sorted_dict = dict(occurence_sorted)
        for key, value in sorted_dict.items():
            if value > (len(arr)/3):
                majority.append(key)
        return majority
