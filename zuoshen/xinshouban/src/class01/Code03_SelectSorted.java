package class01;

public class Code03_SelectSorted {

    public static void SelectSort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return;
        }
        int N = arr.length;

//        for (int i = 0; i < N; i++) {
//            for (int j = i+1; j < N; j++) {
//                if (arr[j] < arr[i]) {
//                    Swap(arr, i, j);        //会交换多次
//                }
//            }
//        }

        for (int i = 0; i < N; i++) {
            int minValueIndex = i;
            for(int j = i + 1; j < N; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            Swap(arr, i, minValueIndex);
        }
    }

    public static void BubbleSort(int[] arr) {
        // 0~N-2  arr[0]和arr[1]比较    arr[1]和arr[2]比较   arr[N-2]和arr[N-1] 比较
        // 0~N-3.....
        if (arr == null || arr.length ==1) {
            return;
        }
        int N = arr.length;
        for (int n = N-1; n >=0; n--){
            for(int i = 0; i < n; i++) {
                if (arr[i] > arr[i + 1]) {
                    Swap(arr, i, i+1);
                }
            }
        }
    }

    public static void InsertSort(int[] arr) {
        //插入排序
        if (arr == null || arr.length ==1) {
            return;
        }
        int N = arr.length;
        //有一个数组，从0开始的，是排好序的
        //是否需要重新定义一个新的数组
        for (int i = 1; i < N; i++){
            for(int j = i-1; j >= 0; j --) {
                if (arr[j+1] >= arr[j]) {
                    break;
                }
                else {
                    Swap(arr, j, j+1);
                }
            }
        }
    }

    public static void Swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void Swap1(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void PrintArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 0, 6, 1, 8, 2, 86, 0, 41};
        PrintArray(arr);
        InsertSort(arr);
        PrintArray(arr);

    }
}
