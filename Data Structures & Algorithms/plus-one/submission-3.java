class Solution {
    public int[] plusOne(int[] digits) {
        int end = digits.length - 1;

        while(end >= 0){
            if(digits[end] < 9){
                digits[end]++;
                return digits;
            }else{
                digits[end] = 0;
                end--;

                if(end < 0){
                    int[] arr = new int[digits.length + 1];
                    arr[0] = 1;
                    return arr;
                }
            }
        }
        return digits;
    }
}
