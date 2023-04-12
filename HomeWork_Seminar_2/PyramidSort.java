package HomeWork_Seminar_2;

/*
 * Реализовать алгоритм пирамидальной сортировки (сортировка кучей).
 */

public class PyramidSort {
    
    public static void stack(int[] array, int i, int size) {
        int left = (2 * i + 1);
        int right = (2 * i + 2);
        int largest = i;
        if (left < size && array[left] > array[i]) {
            largest = left;
        }
        if (right < size && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            stack(array, largest, size);
        }
    }

    public static int delete(int[] array, int size) {
        if (size <= 0) {
            return -1;
        }
        int top = array[0];
        array[0] = array[size - 1];
        stack(array, 0, size - 1);
        return top;
    }

    public static void heapsort(int[] array) {
        int n = array.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
            stack(array, i--, n);
        }
        while (n > 0) {
            array[n - 1] = delete(array, n);
            n--;
        }
    }

    static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 8, 6, -7, -4, 6, -1, 3, 3, 4, -2, 1, 3 };
        heapsort(array);
        printArray(array);
    }
}
