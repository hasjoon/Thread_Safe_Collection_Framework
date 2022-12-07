package thread.thread3;

public class ThreadMainTest {
    public static void main(String[] args) {
        // Thread t0 = new Thread0();
        // Thread t1 = new Thread1();
        // Thread t2 = new Thread2();

        // t1.start();
        // t0.start();
        // t2.start();
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        int mmm = 2;
        System.out.println("2modM: " + b%mmm);
        System.out.println("3modM: " + c%mmm);
        System.out.println("4modM: " + d%mmm);
        System.out.println("5modM: " + e%mmm);
    }
}
