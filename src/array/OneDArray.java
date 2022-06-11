package array;

/**
 * Create a 1-D array and insert a number starting from 1 tp the max num until the end of the array.
 * Access the numbers after inserting them and then display them as an output
 * <p>
 * Output :
 * 1, 2, 3, 4, 5, 6,
 */
public class OneDArray {
    public static void main(String[] args) {

        int[] a1 = new int[6];
        int count = 1;

        for (int i = 0; i < a1.length; i++) {
            a1[i] = count;
            count++;
        }

        for (int j = 0; j < a1.length; j++) {
            System.out.print(a1[j] + ", ");
        }
    }
}
