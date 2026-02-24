import java.util.*;
class unionofArray {
    public static ArrayList<Integer> findUnion(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = nums1.length;
        int m = nums2.length;
        while (i < n && j < m) {
            if (i > 0 && nums1[i] == nums1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && nums2[j] == nums2[j - 1]) {
                j++;
                continue;
            }
            if (nums1[i] < nums2[j]) {
                result.add(nums1[i]);
                i++;
            }
            else if (nums1[i] > nums2[j]) {
                result.add(nums2[j]);
                j++;
            }
            else {
                result.add(nums1[i]);
                i++;
                j++;
            }
        }
        while (i < n) {
            if (i == 0 || nums1[i] != nums1[i - 1]) {
                result.add(nums1[i]);
            }
            i++;
        }
        while (j < m) {
            if (j == 0 || nums2[j] != nums2[j - 1]) {
                result.add(nums2[j]);
            }
            j++;
        }
        return result;
    }
}