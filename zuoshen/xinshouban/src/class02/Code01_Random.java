package class02;

public class Code01_Random {

    public static int[] RandomArr(int MaxLen, int MaxValue) {
        int Len = (int) (Math.random() * (MaxLen+1));   //
        int[] arr = new int[Len];
        for(int i=0; i < Len; i++) {
            arr[i] = (int) (Math.random() * (MaxValue+1));
        }
        return arr;
    }
    public static void PrintArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int CreatRandmA(int a){
        //等概率生成[0,a]的随机数
        return (int) (Math.random() * (a+1));
    }
    public static void main(String[] args) {
        int testTimes = 10000;
        int[] counts = new int[9];
        for (int i = 0; i < testTimes; i ++) {
            int ans = CreatRandmA(8);
            counts[ans] ++;
        }

        for (int i = 0; i <= 8; i++) {
            System.out.println(i+"出现的概率是:" + (double) counts[i] / (double) testTimes);
        }

//        for (int i = 0; i < 10; i ++) {
//            int[] arr = RandomArr(10, 11);
//            PrintArr(arr);
//        }
    }
}
