package linear.array;

/**
 * Search element in 1D linear.array
 * <p>
 * Output :
 * Given linear.array
 * 3 2 4 6 1 5
 * Given Key to search : 2
 * Element is found at index 1
 */
public class ArraysSearch {
    public static void main(String[] args) {

        int a1[] = new int[]{3, 2, 4, 6, 1, 5};

        int index = search(a1, 2);

        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at index " + index);
    }

    public static int search(int arr[], int key) {

        System.out.println("Given linear.array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nGiven Key to search : " + key);

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == key)
                return j;
        }

        return -1;
    }
}
