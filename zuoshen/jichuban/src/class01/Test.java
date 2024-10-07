package zuoshen.jichuban.src.class01;

public class Test {
    public static void main(String[] args) {
//        int a = 6;
//        int b = 6;
        int[] array = {4, 2, 7, 8, 4};
//        System.out.println("a:" + a + ", b:" + b);
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//        System.out.println("a:" + a + ", b:" + b);

        int i = 1;
        int j = 1;
        System.out.println("array[i]:" + array[i] + ", array[j]:" + array[j]);
        array[i] = array[i] ^ array[j];
        array[j] = array[i] ^ array[j];
        array[i] = array[i] ^ array[j];
        System.out.println("array[i]:" + array[i] + ", array[j]:" + array[j]);
    }
}
