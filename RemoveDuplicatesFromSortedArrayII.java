/**
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * 
 * For example,
 * Given sorted array A = [1,1,1,2,2,3],
 * 
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] A) {
        int num = 0;
        int first = 0;
        int second = 1;
        for (int i=0 ; i < A.length ; i++) {
            if (i == 0) {
                first = A[i];
                num ++;
                continue;
            }
            if (i == 1) {
                num ++;
                second = A[i];
                continue;
            }
            if (!(first == second && second == A[i])) {
                A[num] = A[i];
                first  = A[num-1];
                second = A[num];
                num ++;
            }
        }
        return num;
    }
}