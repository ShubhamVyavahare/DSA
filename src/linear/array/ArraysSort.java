package linear.array;

import java.util.Arrays;

/**
 * Implement sorting on 1D
 * <p>
 * Output :
 * Array Before sorting
 * 3 2 4 6 1 5
 * Array After sorting
 * 1 2 3 4 5 6
 */
public class ArraysSort {
    public static void main(String[] args) {

        int a1[] = new int[]{3, 2, 4, 6, 1, 5};

        System.out.println("Array Before sorting ");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }

        Arrays.sort(a1);

        System.out.println("\nArray After sorting ");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
    }
}
