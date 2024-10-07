package zuoshen.jichuban.src.class01;

import java.util.Arrays;

public class Code04_BSExit {

    public static boolean isExit(int[] array, int value) {
        
        if (array == null) {
            return false;
        }
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (array[mid] == value) {
                return true;
            } else if (array[mid]>value) {
               right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
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
    public static boolean isValueInArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true; // 如果找到数值，返回true
            }
        }
        return false; // 如果遍历完数组都没有找到，返回false
    }

    public static void main(String[] args) {
        int testCounts = 500000;
        boolean flag = true;
        for (int i = 0; i < testCounts; i++) {
            int[] array = generateRandomArray(20, 20);
            Arrays.sort(array);
            int value = (int) (Math.random() * 10);
            if (isExit(array, value) != isValueInArray(array, value)) {
                flag = false;
                printArray(array);
                System.out.println("value:" + value);
                break;
            }
        }
        if (!flag) {
            System.out.println("Error!!");
        } else {
            System.out.println("Succeed");
        }
    }
}
