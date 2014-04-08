/**
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * 
 * For example,
 * Given sorted array A = [1,1,1,2,2,3],
 * 
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] A) {
        int pre = 0;
        int len=0;
        for(int i=0; i<A.length; i++) {
            if (i == 0) {
                pre = A[i];
                len ++;
                continue;
            }
            if (A[i]!=pre) {
                pre = A[i];
                A[len] = A[i];
                len ++;
            }
        }
        return len;
    }
}