/* 
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length. 
 */

public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        if (A == null) {
            return 0;
        }
        int num=0;
        for (int cur : A) {
            if (cur != elem) {
                A[num]=cur;
                num++;
            }
        }
        return num;
    }
}