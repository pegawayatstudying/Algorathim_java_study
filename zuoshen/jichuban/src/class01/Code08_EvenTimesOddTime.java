package zuoshen.jichuban.src.class01;

public class Code08_EvenTimesOddTime {

    public static void swap(int[] array, int a, int b) {
        array[a] = array[a] ^ array[b];
        array[b] = array[a] ^ array[b];
        array[a] = array[a] ^ array[b];
    }

    public static void printOddTimesNum1(int[] array) {
        int eor = 0;
        for (int i = 0; i < array.length; i++) {
            eor = eor ^ array[i];
        }
        System.out.println(eor);
    }

    public static void printBinary(int value) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((value & (1 << i))==0?0:1);

//            if ((value & (int)(Math.pow(2, i))) == 0) {
//                System.out.print("0");
//            } else {
//                System.out.print("1");
//            }
        }
        System.out.println();
    }

    public static int getFirstOne(int value) {
        //提取最右侧的1
        return value & ((~value) + 1);
    }

    //提取出现奇数次的两种数
    public static void printOddTimesNum2(int[] array) {
        int eor = 0;
        for (int i = 0; i < array.length; i++) {
            eor ^= array[i];
        }
        // eor = a ^ b;
        // eor != 0;
        // eor肯定有一个1， 找出eor的最右边的1
        int rightOne = eor & (~eor + 1);
        int eor1 = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & rightOne) == 0) {
                eor1 ^= array[i];
            }
        }
        System.out.println("Num1:" + eor1 + ", Num2:" + (eor1^eor));
    }

    //数出二进制中1的个数
    public static int bit1counts(int value) {
        int count = 0;
        while (value != 0) {
            int rightone = value & ((~value) + 1);
            value = value ^ rightone;
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
//        int value = 120;
//        System.out.println(value);
//        printBinary(value);
//        int firstOne = getFirstOne(value);
//        System.out.println(firstOne);
//        printBinary(firstOne);
//
//        int[] array = {3, 5, 4, 31, 5, 3, 5, 26, 5, 26, 31, 0, 4, 31, 0, 26, 31, 0};
//        printOddTimesNum2(array);

        int a = 125;
        printBinary(a);
        System.out.println(bit1counts(a));
    }
}
