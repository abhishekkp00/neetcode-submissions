class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArr = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                newArr[k++] = nums1[i];
                i++;
            }else{
                newArr[k++] = nums2[j];
                j++;
            }
        }
        while(i < nums1.length){
            newArr[k++] = nums1[i];
            i++;
        }
        while(j < nums2.length){
            newArr[k++] = nums2[j];
            j++;
        }

        int len = newArr.length;
        if (len % 2 != 0) {
            return (double) newArr[len / 2];
        } else {
            return (newArr[len / 2 - 1] + newArr[len / 2]) / 2.0;
        } 

    }

        
    }

