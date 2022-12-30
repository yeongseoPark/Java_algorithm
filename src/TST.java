public class TST {
    int fib(int n) {
        System.out.println("fib " + n + " is called");

        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        TST df = new TST();
        df.fib(6);
    }
}
