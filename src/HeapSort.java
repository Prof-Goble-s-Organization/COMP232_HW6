import java.util.Arrays;
import java.util.Random;

public class HeapSort {
    public static void heapSort(Integer[] values) {
        // Intentionally not implemented -- see homework assignmnet
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    public static void main(String[] args) {
        int size = 20;
        Random rnd = new Random();
        Integer[] list = new Integer[size];

        for (int i = 0; i < list.length; i++) {
            list[i] = rnd.nextInt(100);
        }

        System.out.println("Unsorted List: " + Arrays.toString(list));
        heapSort(list);
        System.out.println("  Sorted List:" + Arrays.toString(list));
    }
}
