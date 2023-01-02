public class Ackermann {
    static int Acker(int m, int n) {
        if (m == 0 )  { return n + 1; }
        else if (n == 0) { return Acker(m-1 , 1); }
        else return Acker(m-1, Acker(m, n-1));
    }

    static int AckerLoop(int m, int n) {
        while (m != 0) {
            if (n == 0) n = 1;
            else n = AckerLoop(m, n-1);
            m -= 1;
        }

        return n + 1;
    }

    public static void main(String[] args) {
        System.out.println(Acker(2,3));
        System.out.println(AckerLoop(3,2));
    }
}
