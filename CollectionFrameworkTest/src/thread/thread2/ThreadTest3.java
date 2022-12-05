package thread.thread2;


public class ThreadTest3{
    static int i = 10;
    static int k = 11;
    public static void main(String[] args) {
        int j = i % 2;
        int l = k % 2;
        System.out.println("i mod 2: " + j);
        System.out.println("k mod 2: " + l);

        boolean firstPing = true;

        while(firstPing){
            for(int i=0; i<3; i++){
            System.out.println("while true");
            }
            firstPing = false;
        }

    }
}
