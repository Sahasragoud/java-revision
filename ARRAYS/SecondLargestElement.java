class SecondLargestElement {
    public int secondLargestElement(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = -1;

        for(int num : nums){
            if(first < num){
                first = num;
            }

            else if(first > num && second < num){
                second = num;
            }
        }

        return second;
    }
}
