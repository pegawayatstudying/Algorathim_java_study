package zuoshen.jichuban.src.class01;

import java.util.Arrays;

public class Code06_BSNearRight {

    public static int nearestIndex(int[] array, int value) {
        int left = 0;
        int right = array.length-1;
        int index = -1;
        while (left<=right) {
            int mid = left + ((right - left) >> 1);
            if (array[mid] <= value) {
                index = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize+1)*Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        int arrLen = arr.length;
        for (int i = 0; i < arrLen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = generateRandomArray(20, 20);
        Arrays.sort(array);
        printArray(array);
        int value = (int) (Math.random() * 10);
        System.out.println("value:"+value);
        System.out.println(nearestIndex(array, value));
    }
}
