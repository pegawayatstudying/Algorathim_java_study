package class03;

public class Code01_Comp {

    public static void BubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return ;
        }
        for (int end = arr.length; end > 0;  end --) {
            for (int i = 1; i < end; i++) {
                if (arr[i-1] > arr[i]) {
                    swap1(arr, i-1, i);
                }
            }
        }
    }

    public static void SelectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minValueIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap1(arr, minValueIndex, i);
        }
    }

    public static void InsertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int end = 1; end < arr.length; end++) {
            for (int pre = end-1; (pre >= 0) && (arr[pre] > arr[pre+1]); pre--) {
                swap(arr, pre, pre+1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void swap1(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void PrintArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 81, 0, 2, 1, 4, 5, 1, 3, 8, 5};
        PrintArr(arr);
        InsertSort(arr);
        PrintArr(arr);
    }
}
