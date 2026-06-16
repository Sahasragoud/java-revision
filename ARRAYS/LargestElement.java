class LargestElement {
    public int largestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for(int num : nums){
            if (largest < num){
                largest = num;
            }
        }
        return largest;
    }
}
