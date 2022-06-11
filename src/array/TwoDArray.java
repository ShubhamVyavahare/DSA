package array;

/**
 * Create a 2-D integer array and insert a number starting from 1 to the max number that could be inserted till the end of the 2-D array.
 * Access the number after inserting them and then display them as output.
 * <p>
 * Output:
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 */
public class TwoDArray {
    public static void main(String[] args) {

        int[][] a1 = new int[3][4];
        int count = 1;

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
