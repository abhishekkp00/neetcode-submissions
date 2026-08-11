class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> deque = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];

        int left = 0;
        int right = 0;
        int index = 0;

        while (right < nums.length) {

            // Remove smaller elements
            while (!deque.isEmpty() &&
                   nums[deque.peekLast()] < nums[right]) {
                deque.pollLast();
            }

            deque.addLast(right);

            // Remove elements outside window
            if (deque.peekFirst() < left) {
                deque.pollFirst();
            }

            // Window size = k
            if (right - left + 1 == k) {
                ans[index++] = nums[deque.peekFirst()];
                left++;
            }

            right++;
        }

        return ans;
    }
}