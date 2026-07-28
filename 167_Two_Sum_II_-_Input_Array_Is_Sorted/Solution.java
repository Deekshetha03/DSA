class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] TwoSum = new int[2];
        int len = numbers.length;
        int left = 0, right = len-1;
        while(left<=right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                TwoSum[0]=left+1;
                TwoSum[1] = right + 1;
                return TwoSum;
            }
            else if (sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return TwoSum;
    }
}