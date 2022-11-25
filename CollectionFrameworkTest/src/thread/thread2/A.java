package thread.thread2;

public class A {
    /*
     * Synchronized Method
     * 클래스의 인스턴스에 락을 건다
     */
    // public void print(String name){
    // System.out.println(name + "락 안걸림");
    // }

    // public synchronized void run(String name){
    // System.out.println(name + "lock");
    // try{
    // Thread.sleep(1000); //1초 멈춤
    // }catch (InterruptedException e){ //슬립동안 인터럽트 와서 동작하면 exception //스레드가 죽지 않게 함
    // 예외처리를 해서
    // e.printStackTrace();
    // }

    // System.out.println(name + "unlock");
    // }

    /*
     * Static Synchronized Mothod
     * 클래스 단위로 락이 발생함
     */

    // public synchronized void print(String name){
    // System.out.println(name + " 스태택은 인스턴스와 락을 공유하지 않음");
    // }

    // public static synchronized void run(String name){
    // System.out.println(name + "lock");
    // try{
    // Thread.sleep(1000); //1초 멈춤
    // }catch (InterruptedException e){ //슬립동안 인터럽트 와서 동작하면 exception
    // e.printStackTrace();
    // }

    // System.out.println(name + "unlock");
    // }

    /*
     * Synchronized Block
     * 메소드 단위로 락이 발생함
     * 로직이 섞여있는 경우(메소드가 많을 경우) 필요한 부분만 락을 걸 수 있어서 효율적임
     * 동기화가 필요한 영역에만 락을 걸기위해서 사용한다
     */

     //어레이 리스트 2개

    public void run(String name) {

        

          //this 대신에 특정 클래스에 락을 걸수도 있음(B.class)
            System.out.println(name + "lock");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "unlock");
        

    }

    /*
     * Static Synchronized Block
     * static Synchronized와 다른점은 lock객체를 지정하고 (static 이기에
     * this 로 현재 객체를 가리키는 표현 불가능) block으로 범위를 한정할 수 있음
     * 이외에 클래스 단위로 락을 공유한다는 점은 같다
     */

    // public static synchronized void run(String name) {
    // synchronized (A.class) {
    // System.out.println(name + "lock");
    // try {
    // Thread.sleep(1000);
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }

    // System.out.println(name + "unlock");
    // }
    // }

}
