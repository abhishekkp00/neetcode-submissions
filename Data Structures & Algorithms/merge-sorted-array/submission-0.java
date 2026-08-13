class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int first = 0;
        int sec = 0;

        int[] ans = new int[m + n];
        int i = 0;

        while (first < m && sec < n) {

            if (nums1[first] < nums2[sec]) {
                ans[i++] = nums1[first++];
            } else {
                ans[i++] = nums2[sec++];
            }
        }

        while (first < m) {
            ans[i++] = nums1[first++];
        }

        while (sec < n) {
            ans[i++] = nums2[sec++];
        }

        int k = 0;

        for (int j = 0; j < ans.length; j++) {
            nums1[k++] = ans[j];
        }
    }
}