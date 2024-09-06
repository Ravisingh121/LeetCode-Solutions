class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        int[] merged = new int[totalLength];

        int i=0, j=0, k=0;
        while(i<m || j<n){
            int num1 = (i<m)? nums1[i]: Integer.MAX_VALUE;
            int num2 = (j<n)? nums2[j]: Integer.MAX_VALUE;

            if(num1 <= num2){
                merged[k++] = num1;
                i++;
            }else{
                merged[k++] = num2;
                j++;
            }
        }

        if(totalLength % 2 == 0){
            int mid1 = merged[totalLength/2-1];
            int mid2 = merged[totalLength/2];
            return(double)(mid1 + mid2)/2;
        }else{
            return merged[totalLength / 2];
        }
    }
    public static void main(String[] args){
        Solution solution = new Solution();

        int[] nums1 = {1,3};
        int[] nums2 = {2};

        System.out.println(solution.findMedianSortedArrays(nums1, nums2));

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println(solution.findMedianSortedArrays(nums3, nums4));
    }
}

