package class01;

public class Code02_printB {
    public static void printBit(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? 0 : 1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        printBit(2147483647);
        printBit(Integer.MIN_VALUE);
    }
}
