package zuoshen.xinshouban.src.class01;

public class Code01_SumOfFactorial {
    //阶乘

    public static long f1(int N) {
        //计算阶乘的和 用了两层for循环
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += factorial(i);
        }
        return ans;
    }

    public static long f2(int N) {
        long ans = 1;
        long sum = 0;
        for (int i = 1; i <= N ; i++) {
            ans *= i;
            sum += ans;
        }
        return sum;
    }

    public static long factorial(int N) {
        long ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= i;
        }
        return ans;
    }

    public static long factorial1(int N) {
        //递归
        if (N<=1) {
            return 1;
        }
        return N * f1(N-1);
    }

    public static void main(String[] args) {
        int N = 20;
        System.out.println(factorial(N));
        System.out.println(f1(N));
        System.out.println(f2(N));
    }
}
